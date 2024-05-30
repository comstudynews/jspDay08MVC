package org.comstudy.web;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

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
//		mappings.put("/home", new HomeController());
//		mappings.put("/board", new BoardController());
//		mappings.put("/member", new MemberController());
//		mappings.put("/shop", new ShopController() );
//		mappings.put("/todo", new TodoController());
//		mappings.put("/gallery", new GalleryController());
	}
	
	// 생성자 오버로딩
	// 외부에서 배열을 받아서 객체를 생성한다
	public HandlerMapping(String[] controllerArr) {
		for(int i=0; i<controllerArr.length; i++) {
			StringTokenizer tk = new StringTokenizer(controllerArr[i], "=");
			String key = tk.nextToken();
			String valueStr = tk.nextToken();
			try {
				Controller obj = (Controller)Class.forName(valueStr).newInstance();
				mappings.put(key, obj);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
