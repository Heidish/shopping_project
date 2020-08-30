<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*, com.heidi.dto.*" %>
<%
	List<ProductDTO> productList = (ArrayList)request.getAttribute("productList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트 : admin/product/ProductList.jsp</title>
	<style type="text/css">
		a:link, a:visited, a:active {
			text-decoration:none;
			color:black;
		}
		th {
			background-color: gray;
			text-align : center;
			border-bottom: 1px solid #e4e4e4;
		}
		td {
			text-align: center;
		}
		div.a {font-size: 13px;}
		div.b {font-size: 14px;}
	</style>
</head>
<body>
<div align="center" class="b">
	<table width="1000" border="0" cellspacing="0">
		<tr height="900">
			<td width="130" valign="top" > <!-- 좌측 영역 -->
				<jsp:include page="/admin/sub_menu.jsp" flush="false" />
			</td>
			
			<td width="770" valign="top" > <!-- 우측 영역 -->
				<h1>상품리스트</h1>
				<form name="frm" method="post">
				<div style="width: 770px;" align="center" class="a">
					
					<div style="text-align: right;" class="b">
						상품명 : <input type="text" name="search" size="20" />
						<input type="button" id="btn1" value="검색" onclick="go_search()" />
						<input type="button" id="btn1" value="전체보기" onclick="go_total()" />
						<input type="button" id="btn1" value="상품등록" onclick="go_wrt()" />
					</div>
						<table width="770">
							<tr>
								<th>번호</th>
								<th>상품명</th>
								<th>원가</th>
								<th>판매가</th>
								<th>등록일</th>
								<th>사용유무</th>
							</tr>
							<c:forEach var="list" items="<%=productList %>">
								<tr>
									<td>${list.pseq }</td>
									<td>${list.name }</td>
									<td>${list.price2 }</td>
									<td>${list.price1 }</td>
									<td><fmt:formatDate value="${list.indate }" /></td>
									<c:choose>
										<c:when test="${useyn==y}">
											<td>사용</td>
										</c:when>
										<c:otherwise>
											<td>미사용</td>
										</c:otherwise>
									</c:choose>
								</tr>
							</c:forEach>
						</table>
						<hr width="770">
					</div>	
				</form>
			</td>
		</tr>
		
		<tr height="100">
			<td colspan="2"> <!-- 하단 영역 -->
				<jsp:include page="/admin/footer.jsp" flush="false" />
			</td>
		</tr>
	
	</table>
</div>
</body>
</html>