package org.comstudy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.Controller;
import org.comstudy.web.ModelAndView;
import org.comstudy.web.board.command.BoardCommand;
import org.comstudy.web.gallery.command.GalleryCommand;

// 게시판의 CRUD를 비롯한 세부 기능을 수행하는 Command가 분기된다.
// 실행 되는 Command에서 DAO등의 기능을 수행하고 그 결과를 
// ModelAndView에 addObject로 셋팅 해 준다.

public class GalleryController implements Controller {
	private Command cmd = new GalleryCommand();
	// Command도 Controller처럼 CRUD 기능별로 클래스를 각각 구현해서 
	// Command HandlerMappging에 매핑 해서 사용한다.

	@Override
	public ModelAndView action(HttpServletRequest req) {
		System.out.println(">>> GalleryController 실행");
		ModelAndView mnv = cmd.execute(req);
		
		return mnv;
	}
}
