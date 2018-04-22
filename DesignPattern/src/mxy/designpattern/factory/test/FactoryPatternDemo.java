package mxy.designpattern.factory.test;

import mxy.designpattern.factory.CarFactory;
import mxy.designpattern.factory.IFactory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		
		IFactory bmwCar = carFactory.getCar("BMW");
		bmwCar.produce();
		
		IFactory audiCar = carFactory.getCar("Audi");
		audiCar.produce();
		
		IFactory benzCar = carFactory.getCar("Benz");
		benzCar.produce();
		
		@SuppressWarnings("unused")
		IFactory flatCar = carFactory.getCar("Flat");
	}

}
