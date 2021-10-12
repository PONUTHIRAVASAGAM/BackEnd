package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.College;

public interface CollegeRepository extends CrudRepository<College,Integer>{
	
	@Query("SELECT log from College log where log.Username=?1 and log.Password=?2")	
	College findByUserNameAndPassWord(String username, String password);
}
