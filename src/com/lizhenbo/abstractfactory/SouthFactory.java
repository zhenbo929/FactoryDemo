package com.lizhenbo.abstractfactory;
/**
 * �Ϸ�ˮ���߲˹���,ר�Ŵ����㽶���Ϸ��߲˵Ĺ���
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
