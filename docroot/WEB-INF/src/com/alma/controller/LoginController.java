package com.alma.controller;
import java.io.IOException;


import java.util.ArrayList;




import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
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
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;


import com.alma.beans.LoginBean;
import com.alma.beans.NavigationBean;
import com.alma.service.LoginService;
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
	ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
	if(themeDisplay.getUser()!=null){
		 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
		 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
		 String responseUrl= requesturl+"/web/guest/profile";
	System.out.println(requesturl + "hi " + responseUrl);	 
	actionResponse.sendRedirect(responseUrl);
		
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
	 System.out.println("LoginController.Authenticate()");
	 String Authentication=LoginService.Authentication(loginBean,themeDisplay);
	 if(Authentication.equals("Login successful")){
	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
	 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
	 String responseUrl= requesturl+"/web/guest/profile";
System.out.println(requesturl + "hi " + responseUrl);	 
actionResponse.sendRedirect(responseUrl);
	 }
	 else 
	 {User user=themeDisplay.getUser();
		 actionRequest.setAttribute("LoginMessage",user.getEmailAddress() );
	 }
}}

@ActionMapping(params = "action=facebook")
public void helloFacebook(final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException {

   	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
   	 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
   	 String responseUrl= requesturl+"/web/guest/profile";    
 	actionResponse.sendRedirect(responseUrl);

}

	

}
