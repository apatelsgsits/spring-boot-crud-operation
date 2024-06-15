package com.javatpoint.exception.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.javatpoint.exception.CustomerNotFoundException;
import com.javatpoint.model.Books;
import com.javatpoint.model.ErrorMessage;
import com.javatpoint.service.BooksService;

//mark class as Controller
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorMessage> resourceNotFoundException(CustomerNotFoundException e, WebRequest r) {
		ErrorMessage message = new ErrorMessage("Not Found", r.toString());

		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	}
}
