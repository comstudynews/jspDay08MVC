package org.comstudy.web;

import java.util.HashMap;
import java.util.Map;

import org.comstudy.web.controller.BoardController;
import org.comstudy.web.controller.GalleryController;
import org.comstudy.web.controller.HomeController;
import org.comstudy.web.controller.MemberController;
import org.comstudy.web.controller.ShopController;
import org.comstudy.web.controller.TodoController;
import org.comstudy.web.member.command.MemberCommand;

public class HandlerMapping {
	
	Map<String, Controller> mappings = new HashMap<String, Controller>();
	public HandlerMapping() {
		mappings.put("/home", new HomeController());
		mappings.put("/board", new BoardController());
		mappings.put("/member", new MemberController());
		mappings.put("/shop", new ShopController() );
		mappings.put("/todo", new TodoController());
		mappings.put("/gallery", new GalleryController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
