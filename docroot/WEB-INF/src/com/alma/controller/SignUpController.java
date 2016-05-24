package com.alma.controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.alma.beans.LoginBean;
import com.alma.beans.SignupBean;
import com.alma.service.SignupService;
import com.alma.utilities.Utility;
import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

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
		modelAndView.addObject("passwordMatch",renderRequest.getAttribute("passwordMatch"));
		modelAndView.addObject("hi","portlet");
		modelAndView.setViewName("signup");
		return modelAndView;}


	@ActionMapping(params="action=register")
	public void RegisterUser (@ModelAttribute(value = "signupBean") SignupBean signupBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse){
		SignupBean signupbean=new SignupBean();
		Gson json=new Gson();
		signupbean.setAbout_you(actionRequest.getParameter("about"));
		signupbean.setCity(actionRequest.getParameter("city"));
		signupbean.setDob(Utility.convertToDate(actionRequest.getParameter("dob"), "mm/dd/yyyy"));
		signupbean.setEmail(actionRequest.getParameter("email"));
		signupbean.setGenere(actionRequest.getParameter("genere"));
		signupbean.setPhone(actionRequest.getParameter("phone"));
		signupbean.setScreenname(actionRequest.getParameter("screenname"));
		signupBean.setSkills(null);
		signupbean.setSociallinks(null);
		signupbean.setType(actionRequest.getParameter("type"));
		if(actionRequest.getParameter("password").equals(actionRequest.getParameter("cpassword")))
		{
			signupbean.setPassword(actionRequest.getParameter("password"));	
		}
		else
			actionRequest.setAttribute("passwordMatch", "passwords doesn't match");
		String signupJson=json.toJson(signupbean, SignupBean.class);
		System.out.println(signupJson);
		signupBean=json.fromJson(signupJson, SignupBean.class);
		String profileName=SignupService.RegisterUser(signupBean);
	}

}
