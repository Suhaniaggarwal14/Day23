package com.graymatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.graymatter.exception.ResourceNotFoundException;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException rnf){
		return new ResponseEntity<>("no id present",HttpStatus.NOT_FOUND);

}
	
	
}
 
