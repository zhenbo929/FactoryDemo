package com.lizhenbo.factorymethod;
/**
 * 苹果工厂来专门创建苹果的工厂
 * @author LIZHENBO
 */
public class AppleFactory implements IFruitFactory{

	@Override
	public IFruit createFruit() {
		return new Apple();
	}

}
