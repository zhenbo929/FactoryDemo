package com.lizhenbo.factorymethod;
/**
 * �㽶����,ר�Ŵ����㽶�Ĺ���
 * @author LIZHENBO
 *
 */
public class BananaFactory implements IFruitFactory{

	@Override
	public IFruit createFruit() {
		return new Banana();
	}

}
