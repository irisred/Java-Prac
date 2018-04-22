package mxy.designpattern.factory;

import mxy.designpattern.factory.implement.AudiFactory;
import mxy.designpattern.factory.implement.BenzFactory;
import mxy.designpattern.factory.implement.BmwFactory;
import util.Utils;

/**
 * 工厂模式：定义了接口IFactory
 * 这个类CarFactory就是汽车工厂，是与用户进行交互的类，不关心汽车如何生产
 * @author bunny
 *
 */
public class CarFactory {
	public IFactory getCar(String carType) {
		if(!Utils.validateString(carType)) {
			System.out.println("invalid carType");
			return null;
		}
		IFactory retObj = null;
		switch (carType) {
		case "Audi":
			retObj = new AudiFactory();
			break;

		case "BMW":
			retObj = new BmwFactory();
			break;
			
		case "Benz":
			retObj = new BenzFactory();
			break;
			
		default:
			System.out.println("there is no car in this type");
			break;
		}
		
		return retObj;
	}
}
