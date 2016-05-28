package com.alma.controller;
import java.io.IOException;


import java.util.ArrayList;




import java.util.List;

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

import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.alma.beans.FacebookLoginBean;
import com.alma.beans.GloginBean;
import com.alma.beans.LoginBean;
import com.alma.beans.NavigationBean;
import com.alma.beans.SignupBean;
import com.alma.service.LoginService;
import com.alma.utilities.BeanCreation;
import com.alma.utilities.Utility;

@RequestMapping("VIEW")
@Controller("loginController")

public class LoginController {





	String tokengenerated=null;

	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){

		ModelAndView modelAndView=new ModelAndView();
		Gson json = new Gson();
		String session = Utility.nextSessionId();
		tokengenerated=session;

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");

		LoginBean loginBean = new LoginBean();
		modelAndView.addObject("loginBean",loginBean);
		modelAndView.addObject("token",tokengenerated);
		modelAndView.addObject("LoginMessage",renderRequest.getAttribute("LoginMessage"));
		modelAndView.setViewName("login");
		return modelAndView;

	}
	@ActionMapping(params = "action=authenticate")
	public void Authenticate(	
			@ModelAttribute(value = "loginBean") LoginBean loginBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException, PortalException, SystemException{
		Gson json = new Gson();
		String username=actionRequest.getParameter("name");
		String password=actionRequest.getParameter("password");
		String token=actionRequest.getParameter("token");
		LoginBean loginbean=new LoginBean();
		final PortletSession psession = actionRequest.getPortletSession();
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");

		if((psession.getAttribute("LIFERAY_SHARED_LOGINBEAN", PortletSession.APPLICATION_SCOPE))!=null){
			loginbean=(LoginBean) (psession.getAttribute("LIFERAY_SHARED_LOGINBEAN", PortletSession.APPLICATION_SCOPE));
		}
		else{
			loginbean.setUsername(username);
			loginbean.setPassword(password);
			loginbean.setToken(token);
			System.out.println("generated token"+tokengenerated);
			System.out.println(loginbean.getToken());
			if(loginbean.getToken().equals(tokengenerated)){
				System.out.println("token matched");
			}
			String finalJson = json.toJson(loginbean,LoginBean.class);
			loginBean=json.fromJson(finalJson, LoginBean.class);

			System.out.println("username is "+loginBean.getUsername());
			System.out.println("password is "+loginBean.getPassword());
			System.out.println("LoginController.Authenticate()");}
		String profile_name=LoginService.Authentication(loginBean,themeDisplay);
		if(profile_name.equals("User not registered please click here to register")||profile_name.equals("invalid credentials please try again")||profile_name.equals("no profile created"))
		{
			actionRequest.setAttribute("LoginMessage", profile_name);
		}
		else{
			HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
			String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
			psession.setAttribute("LIFERAY_SHARED_PROFILE",profile_name ,PortletSession.APPLICATION_SCOPE);

			String responseUrl= requesturl+"/web/guest/"+profile_name;
			System.out.println(requesturl + "hi " + responseUrl);

			psession.setAttribute("LIFERAY_SHARED_LOGINBEAN", loginbean, PortletSession.APPLICATION_SCOPE);


			actionResponse.sendRedirect(responseUrl);
		}

	}

	@ActionMapping(params = "action=facebook")
	public void helloFacebook(final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException, PortalException, SystemException {
		LoginBean loginBean=new LoginBean();
		Gson json=new Gson();
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");

		FacebookLoginBean facebookLoginBean=new FacebookLoginBean();
		String facebookLoginBeanJson=actionRequest.getParameter("facebookemailJson");
		facebookLoginBean=json.fromJson(facebookLoginBeanJson, FacebookLoginBean.class);
		GloginBean gloginBean=new GloginBean();
		String gloginBeanJson=actionRequest.getParameter("googlejson");
		gloginBean=json.fromJson(gloginBeanJson,GloginBean.class);
		if(gloginBean.getKa()!=null)
		{
			long googleId=Long.parseLong(gloginBean.getKa());
			loginBean.setGoogleid(googleId);
			loginBean.setUsername(gloginBean.getHg());

		}
		if(facebookLoginBean.getId()!=null)
		{
			long facebookId=Long.parseLong(facebookLoginBean.getId());
			loginBean.setFacebookid(facebookId);
			loginBean.setUsername(facebookLoginBean.getEmail());
		}
		final PortletSession psession = actionRequest.getPortletSession();  
		psession.setAttribute("LIFERAY_SHARED_LOGINBEAN", loginBean, PortletSession.APPLICATION_SCOPE);
		String profile_name=LoginService.Authentication(loginBean,themeDisplay);
		if(profile_name.equals("User not registered please click here to register")||profile_name.equals("invalid credentials please try again"))
		{
			actionRequest.setAttribute("LoginMessage", profile_name);
		}
		else{
			HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
			String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
			psession.setAttribute("LIFERAY_SHARED_PROFILE",profile_name ,PortletSession.APPLICATION_SCOPE);
			String responseUrl= requesturl+"/web/guest/"+profile_name;
			System.out.println(requesturl + "hi " + responseUrl);



			actionResponse.sendRedirect(responseUrl);

		}



	}}
