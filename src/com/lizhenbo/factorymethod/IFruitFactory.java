package com.lizhenbo.factorymethod;
/**
 * 水果工厂接口,所有的水果工厂必须实现该接口
 * @author LIZHENBO
 */
public interface IFruitFactory {
	IFruit createFruit();
}
