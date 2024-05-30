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
	
	HandlerMapping handlerMapping = new HandlerMapping();
	ModelAndView mav;
	Controller ctrl;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		context.log(">> process 실행");
		
		// 혼자 해보기 ...
		// RequestURI에서 (ContextPath + /myweb)부분을 제거 하고 
		// 만약 endPoint가 있다면 suffix도 제거 되어야 한다. 
		// 최종적으로 폴더 이름만 urlPattern이 되도록 가공한다.
		String reqUri=req.getRequestURI();
        String ctxPath=req.getContextPath() + "/myweb";
        int beginIndex=ctxPath.length();
        String urlPattern=reqUri.substring(beginIndex);
        if(urlPattern.lastIndexOf("/") != 0) {
        	int endIndex = urlPattern.lastIndexOf("/");
        	urlPattern = urlPattern.substring(0, endIndex);
        } else {
        	urlPattern = "/home";
        }
        System.out.println("urlPattern => " + urlPattern);
		
		ctrl = handlerMapping.getController(urlPattern);
		mav = ctrl.action(req);
		// ViewResolver로 전달해서 실행 되도록 한다.
		
		ViewResolver viewResolver = new ViewResolver();
		viewResolver.forward(req, resp, mav);
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
