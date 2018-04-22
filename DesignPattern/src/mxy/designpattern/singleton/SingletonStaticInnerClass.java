package mxy.designpattern.singleton;

/**
 * 使用静态内部类实现单例模式
 * @author bunny
 *
 */
public class SingletonStaticInnerClass {
	private static class SingletonHolder {
		private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
	}
	
	private SingletonStaticInnerClass() {}
	
	public static final SingletonStaticInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
