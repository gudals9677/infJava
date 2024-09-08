package com.example.springboot.testwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("haburu");
		boolean isValidPassword = password.equalsIgnoreCase("abcd1234!");
		
		return isValidUserName && isValidPassword;
	}
}
