package org.comstudy.web.board.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class BoardCommand implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("message", "게시판 실행 결과");
		
		return mav;
	}
}
