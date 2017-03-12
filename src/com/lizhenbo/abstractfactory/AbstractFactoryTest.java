package com.lizhenbo.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		IFruit fruit = new NorthFactory().createFruit();
		IFruit fruit2 = new SouthFactory().createFruit();
		
		IVegetable vegetable = new NorthFactory().createVegetable();
		IVegetable vegetable2 = new SouthFactory().createVegetable();
		
		fruit.harvest_Fruit();
		fruit2.harvest_Fruit();
		
		vegetable.harvest_Vegetable();
		vegetable2.harvest_Vegetable();
	}
}
