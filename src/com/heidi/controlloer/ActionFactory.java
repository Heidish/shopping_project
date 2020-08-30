package com.heidi.controlloer;

import com.heidi.controller.action.Action;
import com.heidi.controller.action.MemberListAction;
import com.heidi.controller.action.OrderListAction;
import com.heidi.controller.action.ProductListAction;
import com.heidi.controller.action.QnaListAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	public ActionFactory() {
	}

	public static ActionFactory getInstatnce() {
		// getInstance() 메소드에서는 만들어진 공장 객체를 반환시켜주는것.
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		
		if (command.equals("member_list")) {						// 리스트 화면
			action = new MemberListAction();
		}
		if (command.equals("product_list")) {						// 리스트 화면
			action = new ProductListAction();
		}
		if (command.equals("order_list")) {						// 리스트 화면
			action = new OrderListAction();
		}
		if (command.equals("qna_list")) {						// 리스트 화면
			action = new QnaListAction();
		}
		return action;
	}
}
