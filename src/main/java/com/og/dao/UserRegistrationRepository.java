package com.og.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.og.User;



public interface UserRegistrationRepository extends CrudRepository<User, Long>  {

	public List<User> getUserByUserNameAndPassword(String userName,String password);

}

