package com.lizhenbo.factorymethod;
/**
 * 香蕉工厂,专门创建香蕉的工厂
 * @author LIZHENBO
 *
 */
public class BananaFactory implements IFruitFactory{

	@Override
	public IFruit createFruit() {
		return new Banana();
	}

}
