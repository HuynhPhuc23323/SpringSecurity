package com.javatechie.spring.feign.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javatechie.spring.feign.api.dto.PhotoReponse;

@FeignClient(name="PHOTO-CLIENT", url="https://jsonplaceholder.typicode.com")
public interface PhotoClient {

	@GetMapping("/photos")
	public List<PhotoReponse> getPhotos();
	
	@GetMapping("/photos/{id}")
	public PhotoReponse getPhoto(@PathVariable Integer id);
}
