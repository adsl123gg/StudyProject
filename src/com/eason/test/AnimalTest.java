package com.eason.test;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		System.out.println(animal.j);
		System.out.println("==========");
		
		try {
			Animal a = Animal.class.newInstance();
//			System.out.println("==========");
//			Animal b = (Animal) Class.forName("com.eason.test.Animal").newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
