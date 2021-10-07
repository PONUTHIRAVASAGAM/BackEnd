package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.College;

public interface CollegeRepository extends CrudRepository<College,Integer>{
	
	@Query("SELECT cl from College cl where cl.Username=?1 and cl.Password=?2")	
	College findByUserNameAndPassWord(String username, String password);
}
