package com.alerts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//feign
@FeignClient(name = "product-service")
public interface ProductServiceClient { 
	
	@GetMapping("/product/getProduct/{productId}")
	ResponseEntity<?> getProductById(@PathVariable("productId") Long productId);

}
