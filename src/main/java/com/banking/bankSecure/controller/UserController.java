package com.banking.bankSecure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankSecure.dto.BankResponse;
import com.banking.bankSecure.dto.UserRequest;
import com.banking.bankSecure.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public BankResponse createAccount(@RequestBody UserRequest userRequest) {
		
		return userService.createAccount(userRequest);
	}
}
