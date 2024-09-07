package com.in28minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("ready");
	}
	
	@PostConstruct
	public void initalize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {

	public static void main(String[] args) {
		
		try (var context =
				new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)) {

			System.out.println("Some Initialztion completed");

		}
	}
}
