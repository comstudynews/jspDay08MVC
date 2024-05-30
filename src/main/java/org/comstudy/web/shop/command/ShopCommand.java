package org.comstudy.web.shop.command;

import javax.servlet.http.HttpServletRequest;

import org.comstudy.web.Command;
import org.comstudy.web.ModelAndView;

public class ShopCommand  implements Command {

	@Override
	public ModelAndView execute(HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView("shop/list");
		mav.addObject("message", "쇼핑몰 실행 결과");
		
		return mav;
	}
}
