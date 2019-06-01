package com.github.edjdc.demo.event.listener;

import java.util.Arrays;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.github.edjdc.demo.model.User;
import com.github.edjdc.demo.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BoostrapUser {

	private UserRepository userRepository;

	public BoostrapUser(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@EventListener
	public void onContextRefreshedEvent(ContextRefreshedEvent event) {
		log.info("Start bootstrap user");

		User user1 = new User();
		user1.setUsername("A");

		User user2 = new User();
		user2.setUsername("B");

		User user3 = new User();
		user3.setUsername("C");

		User user4 = new User();
		user4.setUsername("D");

		User user5 = new User();
		user5.setUsername("E");

		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5));

		log.info("End bootstrap user");
	}

}
