package com.heidi.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heidi.dao.BoardDAO;
import com.heidi.dto.MemberDTO;
import com.heidi.dto.ProductDTO;

public class ProductListAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/ProductList.jsp";

		System.out.println("url : " + url);
		System.out.println("-------------------------");
		
		BoardDAO bdao = BoardDAO.getInstance();
		List<ProductDTO> productList = bdao.selectAllProducts();
		System.out.println(productList.get(0).toString());
		
		request.setAttribute("productList", productList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
