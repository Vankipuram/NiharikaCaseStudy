package com.signin.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cred")
public class Credential {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Here i am creating the identity for primarry key
	private String userid;
	
	private String useremail;
	private Integer password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Credential(String useremail,String userid, Integer password) {
		super();
		this.userid = userid;
		this.password = password;
		this.useremail= useremail;
	}
	public Credential() {
		
	}
	@Override
	public String toString() {
		return "Credential [userid=" + userid + ", useremail=" + useremail + ", password=" + password + "]";
	}
	
	
	
}
