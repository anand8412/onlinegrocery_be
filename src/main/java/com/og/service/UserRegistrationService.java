package com.og.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.og.User;
import com.og.UserForm;
import com.og.dao.UserRegistrationRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	public UserForm save(UserForm userForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		User savedUser = userRegistrationRepository.save(user);
		userForm.setId(savedUser.getId());
		return userForm;
	}

}
