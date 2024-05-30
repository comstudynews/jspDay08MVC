package org.comstudy.web.member.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class MemberCommand implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView("member/list");
		mav.addObject("message", "회원관리 실행 결과");
		
		return mav;
	}
}
