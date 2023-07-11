package com.alerts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alerts.Dto.AlertsDto;
import com.alerts.Dto.AlertsDto2;
import com.alerts.Dto.AlertsUpdateDto;
import com.alerts.service.AlertsService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/alerts")
public class AlertsController { 
	
	@Autowired
	private AlertsService alertsServ;
	
	@PostMapping("/addAlerts")
	public ResponseEntity<?> addAlerts(@RequestBody AlertsDto alertsDto) {
		return new ResponseEntity<String> (alertsServ.addAlerts(alertsDto), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAlerts/{alertsId}")
	@HystrixCommand(fallbackMethod = "fallback_getAlerts", commandProperties = {
	        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
	})
	public ResponseEntity<?> getAlerts(@PathVariable Long alertsId){
		return new ResponseEntity<AlertsDto2> (alertsServ.getAlerts(alertsId), HttpStatus.OK);
	}
	
	@GetMapping("/getAlerts")
	@HystrixCommand(fallbackMethod = "fallback_getAllAlerts", commandProperties = {
	        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
	})
	public ResponseEntity<?> getAllAlerts() {
		return new ResponseEntity<List<AlertsDto2>> (alertsServ.getAllAlerts(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAlerts/{alertsId}")
	public ResponseEntity<?> deleteAlerts(@PathVariable Long alertsId) {
		return new ResponseEntity<String> (alertsServ.deleteAlerts(alertsId), HttpStatus.OK);
	}
	
	@PutMapping("/updateAlerts/{alertsId}")
	public ResponseEntity<?> updateAlerts(@PathVariable Long alertsId, @RequestBody AlertsUpdateDto ap2) {
		alertsServ.updateAlerts(alertsId, ap2);
		return new ResponseEntity<String> (HttpStatus.OK);
	}
    
	private ResponseEntity<?> fallback_getAlerts(Long alertsId) {
        // Fallback response when getAlerts fails
        return new ResponseEntity<String>("Unable to fetch alerts. Please try again later.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    private ResponseEntity<?> fallback_getAllAlerts() {
        // Fallback response when getAllAlerts fails
        return new ResponseEntity<String>("Unable to fetch all alerts. Please try again later.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
