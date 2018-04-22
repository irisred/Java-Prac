package mxy.designpattern.singleton;

public enum SingletonEnum {
	INSTANCE;
	public void whateverMethod() {
		
	}
	
	public void showMessage() {
		System.out.println("Hello World! " + INSTANCE.getClass().getSimpleName());
	}
}
