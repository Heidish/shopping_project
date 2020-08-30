package com.heidi.dto;

import java.sql.Timestamp;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String zip_num;
	private String address;
	private String phone;
	private String useyn;
	private Timestamp indate;
	
	public MemberDTO() {
	}
	
	public String toString() {
		String str = "==>";
		str += this.id + "__";
		str += this.pwd + "__";
		str += this.name + "__";
		str += this.email + "__";
		str += this.zip_num + "__";
		str += this.address + "__";
		str += this.phone + "__";
		str += this.useyn + "__";
		str += this.indate + "<==";
	    return str;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip_num() {
		return zip_num;
	}

	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUseyn() {
		return useyn;
	}

	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}

	public Timestamp getIndate() {
		return indate;
	}

	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}

}
