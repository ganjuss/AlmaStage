package com.alma.controller;

import java.util.ArrayList;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.google.gson.Gson;

import com.alma.beans.NavigationBean;
import com.alma.utilities.Utility;

/**
 * Portlet implementation class Navigation
 */
@RequestMapping("VIEW")
@Controller("navigationController")
public class NavigationController  {
	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
		
		ModelAndView modelAndView=new ModelAndView();
		Gson json = new Gson();
		List<NavigationBean> navigationList = new ArrayList<NavigationBean>();
		navigationList=Utility.getNavigationBean();

		modelAndView.addObject("hi",navigationList);
		
		modelAndView.setViewName("footer");
		return modelAndView;
		
	}

}
