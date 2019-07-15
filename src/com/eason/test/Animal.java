package com.eason.test;

public class Animal extends AbstractAnimal{
	int i = 2;
	
	public Animal() {
		System.out.println("Animal init");
	}
	
	static {
		System.out.println("static block in Animal");
	}
	
	{
		i = 1;
		System.out.println("block in Animal, i is " + i);
	}
	
	{System.out.println("block in Animal, i is " + i);}
	
	@Override
	public void eat() {
		System.out.println("Animal eat");
	}
	
}
