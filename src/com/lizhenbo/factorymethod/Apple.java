package com.lizhenbo.factorymethod;
/**
 * �����ƻ����
 * @author LIZHENBO
 */
public class Apple implements IFruit {

	public Apple() {
		super();
	}

	@Override
	public void harvest() {
		System.out.println("�ջ�һ��ƻ��!");
	}

}
