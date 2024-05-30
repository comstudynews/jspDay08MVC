package org.comstudy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Controller;
import org.comstudy.web.ModelAndView;

public class HomeController implements Controller {

	@Override
	public ModelAndView action(HttpServletRequest req) {
		System.out.println(">>> HomeController 실행");
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "홈페이지");
		
		return mav;
	}
}