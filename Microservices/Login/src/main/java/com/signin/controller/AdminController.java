package com.signin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signin.entity.Admin;
import com.signin.services.AdminService;
@RestController
public class AdminController {

	@Autowired
	private AdminService ads;
	
	@PostMapping("/registeradmin")
	public Admin saveall(@RequestBody Admin admin) {
		return ads.saveadmin(admin);
	}
	@GetMapping("/getadmin")
	@CrossOrigin(origins="http://localhost:4200")
	public Admin getall(String adminemail) {
		return ads.findByAdminemail(adminemail);
	}
}
