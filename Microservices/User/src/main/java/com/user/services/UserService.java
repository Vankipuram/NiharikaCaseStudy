package com.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;
	
	public void adduserdetails(User user) {
		userrepo.save(user);
	}
	public List<User> showuserdetailsbyId (String email) {
		return userrepo.findByemail(email);
		
	}
	public void deleteUserDetails(String email) {
		 userrepo.deleteByemail(email);
	}
	
}
