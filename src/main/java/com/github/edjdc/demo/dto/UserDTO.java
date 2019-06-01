package com.github.edjdc.demo.dto;

import java.io.Serializable;
import java.util.List;

import com.github.edjdc.demo.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO implements Serializable {

	private static final long serialVersionUID = -3208626584078216949L;

	private List<User> user;
	private long duration;
	
}
