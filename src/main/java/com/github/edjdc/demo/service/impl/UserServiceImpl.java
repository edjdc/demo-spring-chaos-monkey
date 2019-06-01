package com.github.edjdc.demo.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.edjdc.demo.model.User;
import com.github.edjdc.demo.repository.UserRepository;
import com.github.edjdc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return Optional.ofNullable(users)
				.orElse(Collections.<User>emptyList());
	}

}
