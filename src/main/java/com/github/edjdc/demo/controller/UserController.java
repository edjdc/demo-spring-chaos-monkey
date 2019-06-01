package com.github.edjdc.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.edjdc.demo.dto.UserDTO;
import com.github.edjdc.demo.model.User;
import com.github.edjdc.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public UserDTO getAll() {
		long start = System.currentTimeMillis();
		List<User> users = userService.findAll();
		return new UserDTO(users, System.currentTimeMillis() - start);
	}

}
