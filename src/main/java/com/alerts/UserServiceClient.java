package com.alerts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserServiceClient { 
	
	@GetMapping("/user/getUser/{userId}")
	ResponseEntity<?> getUserById(@PathVariable("userId") Long userId);

}