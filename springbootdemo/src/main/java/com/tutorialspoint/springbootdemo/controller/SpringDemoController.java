package com.tutorialspoint.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialspoint.springbootdemo.exception.AccountNotFoundException;;

@RestController
@RequestMapping(value = "demo")
public class SpringDemoController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/accounts/{id}")
	public ResponseEntity<Object> getAccount(@PathVariable("id") String id) {
		if (id.equals("exception")) throw new AccountNotFoundException();		
		return new ResponseEntity<>("Account is returned successfully", HttpStatus.OK);
	}
}
