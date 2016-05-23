package com.alma.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Portlet implementation class Navigation
 */
@RequestMapping("VIEW")
@Controller("navigationController")
public class NavigationController  {
	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
		
		ModelAndView modelAndView=new ModelAndView();


		modelAndView.addObject("hi","portlet");
		
		modelAndView.setViewName("footer");
		return modelAndView;
		
	}

}
