package com.lizhenbo.abstractfactory;
/**
 * 工厂接口,所有的工厂必须实现该接口
 * @author LIZHENBO
 */
public interface IFactory {
	IFruit createFruit();
	IVegetable createVegetable();
}
