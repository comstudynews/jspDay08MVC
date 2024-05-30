package org.comstudy.web;

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {
	private String viewName;
	private Map<String, Object> model = new HashMap<String, Object>();
	
	public ModelAndView() {
		this("");
	}
	public ModelAndView(String viewName) {
		this.viewName = viewName;
	}
	
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
	public void addObject(String key, Object obj) {
		model.put(key, obj);
	}
	
	public Map<String, Object> getModel() {
		return model;
	}
}
