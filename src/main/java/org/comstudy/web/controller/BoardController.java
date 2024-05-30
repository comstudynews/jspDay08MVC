package org.comstudy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Controller;
import org.comstudy.web.ModelAndView;

public class BoardController implements Controller {

	@Override
	public ModelAndView action(HttpServletRequest req) {
	
		// 게시판의 CRUD를 비롯한 세부 기능을 수행하는 Command가 분기된다.
		// 실행 되는 Command에서 DAO등의 기능을 수행하고 그 결과를 
		// ModelAndView에 addObject로 셋팅 해 준다.
		
		ModelAndView mnv = new ModelAndView("board/list");
		mnv.addObject("userName", "홍길동");
		mnv.addObject("message", "Hello world");
		
		return mnv;
	}

}
