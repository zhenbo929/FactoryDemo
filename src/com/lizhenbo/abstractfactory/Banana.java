package com.lizhenbo.abstractfactory;

/**
 * 具体的水果类,香蕉
 * @author LIZHENBO
 *
 */
public class Banana implements IFruit {

	@Override
	public void harvest_Fruit() {
		System.out.println("收获一根香蕉!");
	}
}

