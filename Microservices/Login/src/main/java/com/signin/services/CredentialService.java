package com.signin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signin.entity.Admin;
import com.signin.entity.Credential;
import com.signin.repo.CredentialRepo;
@Service
public class CredentialService {

	@Autowired
	private CredentialRepo credentialRepo;
	
	public Credential saveuser(Credential user) {
		return credentialRepo.save(user);
	}
	public Credential fetchuserId(String useremail) {
		return credentialRepo.findByUseremail(useremail);
		
	}
	public Credential fetchuserIdAndPassword(String useremail,Integer password) {
		return credentialRepo.findByUseremailAndPassword(useremail, password);
		
	}
	/*public Boolean isUserValid(Credential cred) {
		try {
			Credential temp = credentialRepo.findById(cred.getUserid()).get();
			if(temp.getPassword().equals(cred.getPassword()))
				return true;
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}*/
}
