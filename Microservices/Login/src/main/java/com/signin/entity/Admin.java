package com.signin.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admin")
public class Admin {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Here i am creating the identity for primarry key
	private String adminid;
	
	private String adminemail;
	private Integer password;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminemail=" + adminemail + ", password=" + password + "]";
	}
	public Admin(String adminid, String adminemail, Integer password) {
		super();
		this.adminid = adminid;
		this.adminemail = adminemail;
		this.password = password;
	}
	public Admin() {
		
	}

}
