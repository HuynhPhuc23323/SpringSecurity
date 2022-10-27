package com.javatechie.spring.feign.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.feign.api.client.PhotoClient;
import com.javatechie.spring.feign.api.dto.PhotoReponse;

@RestController
public class PhotoController {

	@Autowired
	private PhotoClient client;
	
	@GetMapping("/findAllPhotos")
	public List<PhotoReponse> getAllPhoto(){
		return client.getPhotos();
	}
	
	@GetMapping("findPhoto/{id}")
	public PhotoReponse getPhoto(@PathVariable String id) {
		return client.getPhoto(Integer.valueOf(id));
	}
	
}
