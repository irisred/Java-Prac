package mxy.designpattern.factory.implement;

import mxy.designpattern.factory.IFactory;

/**
 * 具体的汽车生产类，被汽车工厂调用，负责生产产品，实现底层汽车制造的接口
 * 
 * @author bunny
 *
 */
public class AudiFactory implements IFactory {

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		System.out.println("here is a Audi factory, called produce() method");
	}

}
