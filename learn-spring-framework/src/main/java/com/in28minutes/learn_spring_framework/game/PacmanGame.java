package com.in28minutes.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{

	public void up() {
		System.out.println("Pacman Jump");
	}
	
	public void down() {
		System.out.println("Go Pacman");
	}
	
	public void left() {
		System.out.println("Pacman back");
	}
	
	public void right() {
		System.out.println("Pacman!!!");
	}
}
