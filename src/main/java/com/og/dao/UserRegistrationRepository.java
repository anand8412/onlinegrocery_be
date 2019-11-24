package com.og.dao;

import org.springframework.data.repository.CrudRepository;

import com.og.User;



public interface UserRegistrationRepository extends CrudRepository<User, Long>  {

}

