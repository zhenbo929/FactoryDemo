package com.lizhenbo.simplefactory;
/**
 * 水果工厂,用来创建所有的水果
 * @author LIZHENBO
 */
public class FruitFactory {
	
	public static IFruit createFruit(int whichFruit){
		IFruit fruit = null;
		switch (whichFruit) {
		case 0:
			fruit= new Apple();//创建苹果
			break;
		case 1:
			fruit= new Banana();//创建香蕉
			break;
		}
		return fruit;
	}
}
