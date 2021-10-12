package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer>{

	@Query("SELECT log from Admin log where log.Username=?1 and log.Password=?2")	
	Admin findByUserNameAndPassWord(String username, String password);
}
