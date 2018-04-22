package mxy.designpattern.singleton;

/**
 * 双校验锁：线程安全，实现难度较复杂
 * @author bunny
 *
 */
public class SingletonLazyDCL {
	private volatile static SingletonLazyDCL instance;
	
	private SingletonLazyDCL() {}
	
	public static SingletonLazyDCL getInstance() {
		if(instance == null) {
			synchronized(SingletonLazyDCL.class) {
				if(instance == null) {
					instance = new SingletonLazyDCL();
				}
			}
		}
		
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World! " + instance.getClass().getSimpleName());
	}
}
