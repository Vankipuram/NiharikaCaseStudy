package com.signin.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.signin.entity.Credential;
@Repository
public interface CredentialRepo extends MongoRepository<Credential, String>{

	public Credential findByUseremail(String useremail);
	public Credential findByUseremailAndPassword(String useremail,Integer password);
	

}
