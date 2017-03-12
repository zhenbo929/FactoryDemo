package com.lizhenbo.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		
		IFruit fruit = new AppleFactory().createFruit();
		IFruit fruit2 = new BananaFactory().createFruit();
		fruit.harvest();
		fruit2.harvest();
	}
}
