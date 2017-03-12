package com.lizhenbo.simplefactory;
/**
 * 具体的苹果类
 * @author LIZHENBO
 */
public class Apple implements IFruit {

	@Override
	public void harvest() {
		System.out.println("收获一个苹果!");
	}

}
