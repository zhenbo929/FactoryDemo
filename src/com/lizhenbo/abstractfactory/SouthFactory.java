package com.lizhenbo.abstractfactory;
/**
 * 南方水果蔬菜工厂,专门创建香蕉和南方蔬菜的工厂
 * @author LIZHENBO
 *
 */
public class SouthFactory implements IFactory{

	@Override
	public IFruit createFruit() {
		return new Banana();
	}

	@Override
	public IVegetable createVegetable() {
		return new SouthVegetable();
	}

}
