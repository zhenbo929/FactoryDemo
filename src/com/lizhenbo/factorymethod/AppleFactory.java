package com.lizhenbo.factorymethod;
/**
 * ƻ��������ר�Ŵ���ƻ���Ĺ���
 * @author LIZHENBO
 */
public class AppleFactory implements IFruitFactory{

	@Override
	public IFruit createFruit() {
		return new Apple();
	}

}
