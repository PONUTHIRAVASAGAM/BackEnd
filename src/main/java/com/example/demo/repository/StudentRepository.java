package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	@Query("SELECT log from Student log where log.Username=?1 and log.Password=?2")	
	Student findByUserNameAndPassWord(String username, String password);
}
