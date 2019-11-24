package com.og.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.og.UserForm;
import com.og.service.UserRegistrationService;

@RestController
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ResponseEntity<UserForm> save(@RequestBody UserForm userForm) {
		System.out.println(userForm);
		UserForm savedUserForm = userRegistrationService.save(userForm);
		return ResponseEntity.status(HttpStatus.OK).body(savedUserForm);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/authenticateUser", method = RequestMethod.POST)
	public ResponseEntity<UserForm> getUserByUserNameAndPassword(@RequestBody UserForm userForm) {
		System.out.println(userForm);
		UserForm savedUserForm = userRegistrationService.getUserByUserNameAndPassword(userForm);
		if (savedUserForm.getErrorMessage() != null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(savedUserForm);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(savedUserForm);
		}
	}

}
