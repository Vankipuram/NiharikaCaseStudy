package com.signin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signin.entity.Credential;
import com.signin.services.CredentialService;

@RestController
public class CredController {

	@Autowired
	private CredentialService credentialService;
	
	/*@PostMapping("/save")
	public String saveUser(@RequestBody Credential cre) {
		credentialService.saveuser(cre);
		return "user s saved";
	}*/
	@PostMapping("/register") //checking whether the userid is already present in the data base or not if present throw exception
	@CrossOrigin(origins="http://localhost:4200")
	public Credential registeruser(@RequestBody Credential cre) throws Exception{
		String temp = cre.getUseremail();
		if(temp != null && !"".equals(temp)) {
			Credential cd = credentialService.fetchuserId(temp);
			if(cd !=null) {
				throw new Exception("user with "+temp+" is already present");
			}
			
		}
		Credential cred = null;
		cred=credentialService.saveuser(cre);
		return cred;
		
	}
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public Credential loginUser(@RequestBody Credential cre) throws Exception {
		String temp = cre.getUseremail();
		Integer password = cre.getPassword();
		Credential cd= null;
		if(temp != null && password != null) {
		 cd = credentialService.fetchuserIdAndPassword(temp, password);
		}
		if(cd == null) {
			throw new Exception("bad credential");
		}
		return cd;
	}
}
