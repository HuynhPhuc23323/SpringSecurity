package com.javatechie.spring.feign.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javatechie.spring.feign.api.dto.PostReponse;

@FeignClient(name="POST-CLIENT", url="https://jsonplaceholder.typicode.com")
public interface PostClient {

	@GetMapping("/posts")
	public List<PostReponse> getAllPosts();
	
	@GetMapping("/posts/{id}")
	public PostReponse getPost(@PathVariable Integer id);
	
}
