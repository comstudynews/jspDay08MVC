package org.comstudy.web.gallery.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class GalleryCommand implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("gallery/list");
		return mav;
	}

}
