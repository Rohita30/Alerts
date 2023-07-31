package com.alerts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alerts.exception.AlertsNotFoundException;

@ControllerAdvice
public class AlertsExceptionController { 
	
	@ExceptionHandler(value = AlertsNotFoundException.class)
	   public ResponseEntity<Object> exception(AlertsNotFoundException exception) {
		   
	      return new ResponseEntity<>("Alert is not found", HttpStatus.NOT_FOUND);
	      
	   }

}
