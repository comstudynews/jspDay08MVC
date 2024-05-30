package org.comstudy.web;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// forward 하거나 redirect하는 객체

public class ViewResolver {
	private String viewName;
	private Map<String, Object> model;
	private String prefix = "/WEB-INF/views/";
	private String suffix = ".jsp";
	
	public void forward(HttpServletRequest req, HttpServletResponse resp, ModelAndView mav) throws ServletException, IOException {
		System.out.println(">>> ViewResolver 실행");
		
		viewName = prefix + mav.getViewName() + suffix;
		model = mav.getModel();
		
		Iterator<String> keys = model.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			// model에 저장된 데이터를 request에 바인딩한다.
			req.setAttribute(key, model.get(key));
			System.out.println(key + " => " + model.get(key));
		}
		
		System.out.println("view name => " + viewName);
		
		// forward 또는 redirect 실행
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
}
