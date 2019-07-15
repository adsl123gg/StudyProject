package com.eason.test;

import java.util.ArrayList;
import java.util.List;

public class StaticResolution {
	
	List<int[]> list = new ArrayList<>();
	
	static abstract class Human {}
	
	static class Man extends Human {}
	static class Women extends Human {}
	
	public void sayHello(Human human) {
		System.out.println("sayHello human");
	}
	public void sayHello(Man human) {
		System.out.println("sayHello man");
	}
	public void sayHello(Women human) {
		System.out.println("sayHello women");
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human women = new Women();
		StaticResolution sr = new StaticResolution();
		sr.sayHello((Man)man);
		sr.sayHello(women);
		
	}
}
