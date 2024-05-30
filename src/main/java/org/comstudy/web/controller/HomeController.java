package org.comstudy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Controller;
import org.comstudy.web.ModelAndView;

public class HomeController implements Controller {

	@Override
	public ModelAndView action(HttpServletRequest req) {
		
		return new ModelAndView("home");
	}
}