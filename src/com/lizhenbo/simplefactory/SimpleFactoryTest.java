package com.lizhenbo.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		
		IFruit fruit = FruitFactory.createFruit(0);
		IFruit fruit2 = FruitFactory.createFruit(1);
		fruit.harvest();
		fruit2.harvest();
	}
}
