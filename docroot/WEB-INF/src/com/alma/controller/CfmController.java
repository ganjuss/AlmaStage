package com.alma.controller;

import java.util.List;

import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.alma.beans.CfmBean;
import com.alma.beans.LoginBean;
import com.alma.service.CfmService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * Portlet implementation class Cfm
 */
@RequestMapping("VIEW")
@Controller("cfmController")

public class CfmController  {


	@RenderMapping
	public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse) throws SystemException{
		
		ModelAndView modelAndView=new ModelAndView();
		final PortletSession psession = renderRequest.getPortletSession();
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
            LoginBean loginbean=new LoginBean();
			String profile_name= (String) psession.getAttribute("LIFERAY_SHARED_PROFILE", PortletSession.APPLICATION_SCOPE);
            List<CfmBean> CfmList=CfmService.getCfmListByType(profile_name);
		
		modelAndView.setViewName("cfm");
		return modelAndView;
		
	}
	}

