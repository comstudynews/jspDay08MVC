package org.comstudy.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.web.controller.BoardController;

public class DispatcherServlet extends HttpServlet {
	
	ServletContext context;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		context.log("process 실행");
		
		Controller ctrl = new BoardController();
		ModelAndView mav = ctrl.action(req);
		// ViewResolver로 전달해서 실행 되도록 한다.
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
}
