package com.javatechie.spring.feign.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.feign.api.client.UserClient;
import com.javatechie.spring.feign.api.dto.UserReponse;

@RestController
public class UserController {
	
	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUser")
	public List<UserReponse> getAllUsers(){
		return client.getUsers();
	}
	
}
