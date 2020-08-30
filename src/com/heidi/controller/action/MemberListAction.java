package com.heidi.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heidi.dao.BoardDAO;
import com.heidi.dto.MemberDTO;

public class MemberListAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/member/memberList.jsp";
		System.out.println("url : " + url);
		System.out.println("-------------------------");
		
		BoardDAO bdao = BoardDAO.getInstance();
		List<MemberDTO> memberList = bdao.selectAllMembers();
		System.out.println(memberList.get(0).toString());
		
		request.setAttribute("memberList", memberList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
