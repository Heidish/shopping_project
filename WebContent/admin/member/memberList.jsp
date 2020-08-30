<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*, com.heidi.dto.*" %>
<%
	List<MemberDTO> memberList = (ArrayList)request.getAttribute("memberList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트 : admin/member/memberList.jsp</title>
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
		.b {
			font-size: 14px;
			text-align: center;
		}

	</style>
</head>
<body>
<div style="text-align: right; " class="b c" id="container">
	<table width="1000" border="0" cellspacing="0" class="table table-condensed"> 
		<tr height="900">
			<td width="130" valign="top" > <!-- 좌측 영역 -->
				<jsp:include page="/admin/sub_menu.jsp" flush="false" />
			</td>
			
			<td width="770" valign="top" > <!-- 우측 영역 -->
				<h1>회원리스트</h1>
				<form name="frm" method="post">
				<div style="width: 770px;" align="center" class="a">
					
					<div style="text-align: right;" class="b">
						회원 이름 : <input type="text" name="search" size="20" />
						<input type="button" id="btn1" value="검색" onclick="go_search()" />
					</div>	
						<table width="770">
							<tr>
								<th>아이디(탈퇴여부)</th>
								<th>이름</th>
								<th>이메일</th>
								<th>우편번호</th>
								<th>주소</th>
								<th>전화</th>
								<th>가입일</th>
							</tr>

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