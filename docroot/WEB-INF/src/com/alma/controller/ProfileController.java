package com.alma.controller;

import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * Portlet implementation class Profile
 */
@RequestMapping("VIEW")
@Controller("profileController")
public class ProfileController  {
	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
		
		ModelAndView modelAndView=new ModelAndView();

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
		PortletSession portletSession=renderRequest.getPortletSession();
User user=themeDisplay.getUser();
		modelAndView.addObject("hi",user.getEmailAddress());
		
		modelAndView.setViewName("profile");
		return modelAndView;
		
	}

}
