package com.lizhenbo.abstractfactory;
/**
 * 北方工厂来专门创建苹果和北方蔬菜的工厂
 * @author LIZHENBO
 */
public class NorthFactory implements IFactory{

	@Override
	public IFruit createFruit() {
		return new Apple();
	}

	@Override
	public IVegetable createVegetable() {
		return new NorthVegetable();
	}

}
