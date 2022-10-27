package com.javatechie.spring.feign.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.feign.api.client.PostClient;
import com.javatechie.spring.feign.api.dto.PostReponse;

@RestController
public class PostController {

	@Autowired
	private PostClient client;
	
	@GetMapping("/findAllPosts")
	public List<PostReponse> findAllPosts(){
		return client.getAllPosts();
	}
	
	@GetMapping("findPost/{id}")
	public PostReponse findPost(@PathVariable String id) {
		return client.getPost(Integer.valueOf(id));
	}
	
}
