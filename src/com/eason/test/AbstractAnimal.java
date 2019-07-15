package com.eason.test;

public abstract class AbstractAnimal {
	int j;
	static {
		System.out.println("static block in AbstractAnimal");
	}
	
	{
		j=2;
		System.out.println("block in AbstractAnimal, j is "+j);
	}
	
	public AbstractAnimal() {
//		System.out.println("AbstractAnimal init");
		System.out.println("AbstractAnimal init, j is "+j);
	}
	
	public void eat() {
		System.out.println("AbstractAnimal eat");
	}

}
