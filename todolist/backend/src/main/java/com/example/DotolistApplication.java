package com.example;

import com.example.entity.User;
import com.example.repository.UserRepository;

import java.util.List;


public class DotolistApplication {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		System.out.println("GET ALL USERS");

		List<User> users = userRepository.getAllUsers();

		for (User user : users) {
			System.out.println(user);
		}
	}
}
