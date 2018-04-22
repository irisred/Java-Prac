package mxy.designpattern.singleton;

public class SingletonLazyUnsafe {
	private static SingletonLazyUnsafe instance;
	
	private SingletonLazyUnsafe() {}
	
	public static SingletonLazyUnsafe getInstance() {
		if (instance == null) {
			instance = new SingletonLazyUnsafe();
		}
		
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World! " + instance.getClass().getSimpleName());
	}
}
