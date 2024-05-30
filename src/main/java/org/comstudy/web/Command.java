package org.comstudy.web;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	
	ModelAndView execute(HttpServletRequest req);
	
}
