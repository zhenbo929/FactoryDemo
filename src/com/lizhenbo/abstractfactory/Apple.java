package com.lizhenbo.abstractfactory;
/**
 * 具体的苹果类
 * @author LIZHENBO
 */
public class Apple implements IFruit {

	public Apple() {
		super();
	}

	@Override
	public void harvest_Fruit() {
		System.out.println("收获一个苹果!");
	}

}
