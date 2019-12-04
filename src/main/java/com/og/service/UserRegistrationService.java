package com.og.service;

import java.util.List;

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

	
	public UserForm getUserByUserName(String userName) {
		UserForm userForm = new UserForm();
		List<User> users = userRegistrationRepository.getUserByUserName(userName);
		if (users.size() != 1) {
			userForm.setErrorMessage("user/password does not exist");
			return userForm;
		} else {
			User user = users.get(0);
			BeanUtils.copyProperties(user, userForm);
			return userForm;
		}

	}
	
	public UserForm getUserByUserNameAndPassword(UserForm userForm) {
		List<User> users = userRegistrationRepository.getUserByUserNameAndPassword(userForm.getUserName(),
				userForm.getPassword());
		if (users.size() != 1) {
			userForm.setErrorMessage("user/password does not exist");
			return userForm;
		} else {
			User user = users.get(0);
			BeanUtils.copyProperties(user, userForm);
			return userForm;
		}

	}

}
