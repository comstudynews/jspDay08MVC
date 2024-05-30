package org.comstudy.web;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// forward 하거나 redirect하는 객체

public class ViewResolver {
	private String viewName;
	private Map<String, Object> model;
	
	public void forward(HttpServletRequest req, HttpServletResponse resp, ModelAndView mav) {
		System.out.println(">>> ViewResolver 실행");
		
		viewName = mav.getViewName();
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
	}
}
