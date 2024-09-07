package com.in28minutes.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialztion logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("doSomething");
	}
}


@Configuration
@ComponentScan
public class LazyInitiallizationLauncherApplication {

	public static void main(String[] args) {
		
		try (var context =
				new AnnotationConfigApplicationContext(LazyInitiallizationLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
	}
}
