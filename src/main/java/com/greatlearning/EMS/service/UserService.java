package com.greatlearning.EMS.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.greatlearning.EMS.dto.UserRegistrationDto;
import com.greatlearning.EMS.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
