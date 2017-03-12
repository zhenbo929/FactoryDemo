package com.lizhenbo.simplefactory;
/**
 * ˮ������,�����������е�ˮ��
 * @author LIZHENBO
 */
public class FruitFactory {
	
	public static IFruit createFruit(int whichFruit){
		IFruit fruit = null;
		switch (whichFruit) {
		case 0:
			fruit= new Apple();//����ƻ��
			break;
		case 1:
			fruit= new Banana();//�����㽶
			break;
		}
		return fruit;
	}
}
