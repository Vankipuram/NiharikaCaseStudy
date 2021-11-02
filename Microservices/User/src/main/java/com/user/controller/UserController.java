package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.UserDao;
import com.user.entity.User;
import com.user.services.UserService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userser;
	
	@PostMapping("/user")
	public String adduserDetails(@RequestBody UserDao userdao) {
		User entity = new User();
		entity = userdao.getobject(userdao);
		userser.adduserdetails(entity);
		return "user details added successfully";
	}
	@GetMapping("/userdetails/{email}")
	public List<User> showuserdetails(@PathVariable("email") String email) {
		return userser.showuserdetailsbyId(email);
		
	}
	@DeleteMapping("/deleteUser/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		userser.deleteUserDetails(email);
	}
}
