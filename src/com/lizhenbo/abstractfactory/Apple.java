package com.lizhenbo.abstractfactory;
/**
 * �����ƻ����
 * @author LIZHENBO
 */
public class Apple implements IFruit {

	public Apple() {
		super();
	}

	@Override
	public void harvest_Fruit() {
		System.out.println("�ջ�һ��ƻ��!");
	}

}
