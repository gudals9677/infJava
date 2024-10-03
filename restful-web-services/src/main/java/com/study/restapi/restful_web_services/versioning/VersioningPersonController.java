package com.study.restapi.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("KIM", "CHACHA"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV2 getSecondVersionOfPersonRequestParameter() {
		return new PersonV2(new Name("KIM22", "CHACHA"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getSecondVersionOfPersonRequestHeader() {
		return new PersonV1("test111");
	}
}
