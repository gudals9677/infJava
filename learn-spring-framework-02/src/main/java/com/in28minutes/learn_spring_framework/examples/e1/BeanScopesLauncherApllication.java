package com.in28minutes.learn_spring_framework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;

@Component
class NormalClass {
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApllication {

	public static void main(String[] args) {
		
		try (var context =
				new AnnotationConfigApplicationContext(BeanScopesLauncherApllication.class)) {

			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	}
}