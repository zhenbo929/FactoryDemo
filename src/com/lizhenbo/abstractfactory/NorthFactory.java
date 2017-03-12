package com.lizhenbo.abstractfactory;
/**
 * ����������ר�Ŵ���ƻ���ͱ����߲˵Ĺ���
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
