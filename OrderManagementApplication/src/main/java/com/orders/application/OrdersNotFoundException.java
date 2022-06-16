package com.orders.application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class OrdersNotFoundException extends RuntimeException {
	@ExceptionHandler
	public ResponseEntity<Object> orderException(OrdersNotFoundException ex){
		return new ResponseEntity<Object>("Order Not Found",HttpStatus.NOT_FOUND);
	}
	//public OrdersNotFoundException(String message) {
		//super(message);
	//}

}
