package mxy.designpattern.singleton.test;

import mxy.designpattern.singleton.SingletonEnum;
import mxy.designpattern.singleton.SingletonHunger;
import mxy.designpattern.singleton.SingletonLazySafe;
import mxy.designpattern.singleton.SingletonLazyUnsafe;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonHunger.getInstance().showMessage();
		
		SingletonLazySafe.getInstance().showMessage();
		
		SingletonLazyUnsafe.getInstance().showMessage();
		
		SingletonEnum.INSTANCE.showMessage();
	}

}
