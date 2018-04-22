package mxy.designpattern.singleton;

/**
 * 线程安全的懒汉模式，区别在于synchronized，严重影响效率
 * @author bunny
 *
 */
public class SingletonLazySafe {
	private static SingletonLazySafe instance;
	
	private SingletonLazySafe() {}
	
	public static synchronized SingletonLazySafe getInstance() {
		if(instance == null) {
			instance = new SingletonLazySafe();
		}
		
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World! " + instance.getClass().getSimpleName());
	}
}
