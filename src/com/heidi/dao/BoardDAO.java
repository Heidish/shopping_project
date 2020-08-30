package com.heidi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.heidi.dto.MemberDTO;
import com.heidi.dto.ProductDTO;
import com.heidi.util.DBManager;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();

	public BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 전체 회원 조회해서 반환하는 메소드
	// MemberListAction.java 의 execute() 에서 사용
	public List<MemberDTO> selectAllMembers() {
		String sql = "select * from member";
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDTO mdto = new MemberDTO();
				mdto.setId(rs.getString("id"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setName(rs.getString("name"));
				mdto.setEmail(rs.getString("email"));
				mdto.setZip_num(rs.getString("zip_num"));
				mdto.setAddress(rs.getString("address"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setUseyn(rs.getString("useyn"));
				mdto.setIndate(rs.getTimestamp("indate"));
				list.add(mdto);
			}
		} catch (SQLException e) {
			System.out.println("selectAllMembers() ERR : " + e.getMessage());
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}

	public List<ProductDTO> selectAllProducts() {
		String sql = "select * from product";
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ProductDTO pdto = new ProductDTO();
				pdto.setPseq(rs.getInt("pseq"));
				pdto.setName(rs.getString("name"));
				pdto.setKind(rs.getString("kind"));
				pdto.setPrice1(rs.getInt("price1"));
				pdto.setPrice2(rs.getInt("price2"));
				pdto.setPrice3(rs.getInt("price3"));
				pdto.setContent(rs.getString("content"));
				pdto.setImage(rs.getString("image"));
				pdto.setUseyn(rs.getString("useyn"));
				pdto.setBestyn(rs.getString("bestyn"));
				pdto.setIndate(rs.getTimestamp("indate"));
				list.add(pdto);
			}
		} catch (SQLException e) {
			System.out.println("selectAllProducts() ERR : " + e.getMessage());
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		
		return list;
	}
	
	

}
