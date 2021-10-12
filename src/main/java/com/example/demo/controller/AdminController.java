package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Admin;
import com.example.demo.repository.AdminRepository;

@RestController
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	private AdminRepository AdminRepo;
	@PostMapping(value = "/insert")
	public ResponseEntity<?> insertadmin(@RequestBody final Admin c){
		AdminRepo.save(c);        
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Admin inserted Successfully");
    }
	@PostMapping(value = "/login")	
	public ResponseEntity<?> loginAdmin(@RequestBody final Admin log){
		Admin admin = (Admin) AdminRepo.findByUserNameAndPassWord(log.getUsername(), log.getPassword());
		if(admin!=null)
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfully");
		else
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
			
	
	}
}
