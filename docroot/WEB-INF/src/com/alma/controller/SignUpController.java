package com.alma.controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.alma.beans.FacebookLoginBean;
import com.alma.beans.GloginBean;
import com.alma.beans.LoginBean;
import com.alma.beans.SignupBean;
import com.alma.service.SignupService;
import com.alma.utilities.Utility;
import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

/**
 * Portlet implementation class SignUp
 */
@RequestMapping("VIEW")
@Controller("signupController")
public class SignUpController  {
	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
		Gson json=new Gson();
	
		ModelAndView modelAndView=new ModelAndView();
		SignupBean signupBean=new SignupBean();
		modelAndView.addObject("signupBean",signupBean);
		modelAndView.addObject("passwordMatch",renderRequest.getAttribute("passwordMatch"));
		modelAndView.addObject("hi","portlet");
		modelAndView.setViewName("signup");
		return modelAndView;}


	@ActionMapping(params="action=register")
	public void RegisterUser (@ModelAttribute(value = "signupBean") SignupBean signupBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException, SystemException, PortalException{
		SignupBean signupbean=new SignupBean();
		Gson json=new Gson();
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");

		FacebookLoginBean facebookLoginBean=new FacebookLoginBean();
		String facebookLoginBeanJson=actionRequest.getParameter("facebookemailJson");
		facebookLoginBean=json.fromJson(facebookLoginBeanJson, FacebookLoginBean.class);
		GloginBean gloginBean=new GloginBean();
		String gloginBeanJson=actionRequest.getParameter("googlejson");
		gloginBean=json.fromJson(gloginBeanJson,GloginBean.class);
		if(actionRequest.getParameter("password")!=null){
		if(actionRequest.getParameter("password").equals(actionRequest.getParameter("cpassword")))
		{
			signupbean.setPassword(actionRequest.getParameter("password"));	
		}
		else
			actionRequest.setAttribute("passwordMatch", "passwords doesn't match");}
		else 
		if(gloginBean.getKa()!=null)
		{
			long googleId=Long.parseLong(gloginBean.getKa());
			signupbean.setFacebookid(googleId);
			signupbean.setEmail(gloginBean.getHg());
            signupbean.setPassword("default");
		}
		else
		if(facebookLoginBean.getId()!=null)
		{
			long facebookId=Long.parseLong(facebookLoginBean.getId());
			signupbean.setFacebookid(facebookId);
			signupbean.setEmail(facebookLoginBean.getEmail());
			signupbean.setPassword("default");
		}

		signupbean.setAbout_you(actionRequest.getParameter("about_yous"));
		signupbean.setCity(actionRequest.getParameter("city"));
		signupbean.setDob(Utility.convertToDate(actionRequest.getParameter("dob"), "mm/dd/yyyy"));
		signupbean.setEmail(actionRequest.getParameter("email"));
		signupbean.setGenere(Long.parseLong(actionRequest.getParameter("genere")));
		signupbean.setPhone(actionRequest.getParameter("phone"));
		signupbean.setScreenname(actionRequest.getParameter("screenname"));
		signupbean.setSkills(null);
		signupbean.setSociallinks(null);
		signupbean.setType(Long.parseLong(actionRequest.getParameter("type")));
		signupbean.setFirstname(actionRequest.getParameter("firstname"));
		signupbean.setLastname(actionRequest.getParameter("lastname"));
	
		String signupJson=json.toJson(signupbean, SignupBean.class);
		System.out.println(signupJson);
		signupBean=json.fromJson(signupJson, SignupBean.class);
		HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
		 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
		 String profileName=SignupService.RegisterUser(signupBean,requesturl,themeDisplay);
			final PortletSession psession = actionRequest.getPortletSession();

			psession.setAttribute("LIFERAY_SHARED_PROFILE",profileName ,PortletSession.APPLICATION_SCOPE);

		 String responseUrl= requesturl+"/web/guest/"+profileName;
	System.out.println(requesturl + "hi " + responseUrl);	 
	actionResponse.sendRedirect(responseUrl);
	}

}
