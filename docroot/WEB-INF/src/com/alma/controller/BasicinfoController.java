package com.alma.controller;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.alma.beans.LoginBean;
import com.alma.beans.SignupBean;
import com.alma.utilities.BeanCreation;
import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.theme.ThemeDisplay;



/**
 * Portlet implementation class BasicInfo
 */
@RequestMapping("VIEW")
@Controller("basicinfoController")

public class BasicinfoController  {


	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse) throws PortalException, SystemException{
		ThemeDisplay themeDisplay=(ThemeDisplay)renderRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
		ModelAndView modelAndView=new ModelAndView();
		Gson Json=new Gson();
		LoginBean loginBean=new LoginBean();
		final PortletSession psession = renderRequest.getPortletSession();
        SignupBean signupBean=new SignupBean();
		loginBean=(LoginBean) psession.getAttribute("LIFERAY_SHARED_LOGINBEAN", PortletSession.APPLICATION_SCOPE);
		signupBean= BeanCreation.SignipBeanCreation(loginBean, themeDisplay);
		String signUpBeanjson=Json.toJson(signupBean);
		modelAndView.addObject("hi",signUpBeanjson);	
		modelAndView.setViewName("basicinfo");
		return modelAndView;
		
	}
	}
