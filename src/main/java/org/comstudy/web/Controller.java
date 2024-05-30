package org.comstudy.web;

import javax.servlet.http.HttpServletRequest;

public interface Controller {
	
	// Controller가 공통으로 갖는 기능
	// Controller 실행 후 ModelAndView 객체 반환
	ModelAndView action(HttpServletRequest req);
	
}