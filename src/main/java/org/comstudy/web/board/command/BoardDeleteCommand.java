package org.comstudy.web.board.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class BoardDeleteCommand implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		System.out.println(">>> BoardCommand 실행");
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("message", "게시판 실행 결과");
		mav.addObject("user", "홍길동");
		
		return mav;
	}
}
