package com.signin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.signin.entity.Admin;
@Repository
public interface AdminRepo extends MongoRepository<Admin, String>{

	public Admin findByAdminemail(String adminemail);

}
