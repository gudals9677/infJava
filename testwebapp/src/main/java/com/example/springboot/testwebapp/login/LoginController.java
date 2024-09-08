package com.example.springboot.testwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private AuthenticationService service;
	
	public LoginController(AuthenticationService service) {
		super();
		this.service = service;
	}

	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String login() {
		return "/login";
	}
	
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String welcomePage
			(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(service.authenticate(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "/welcome";			
		}
		
		model.put("errorMessage", "Invalid Credentials! try again!");
		return "/login";
	}
}
