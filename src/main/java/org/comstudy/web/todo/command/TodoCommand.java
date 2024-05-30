package org.comstudy.web.todo.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class TodoCommand  implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView("todo/list");
		mav.addObject("message", "Todo List 실행 결과");
		
		return mav;
	}
}
