package mxy.designpattern.singleton;

/**
 * 这个例子就是饿汉模式的单例模型
 * @author bunny
 *
 */
public class SingletonHunger {

	// 创建 SingleObject 的一个对象
	private static SingletonHunger instance = new SingletonHunger();

	// 让构造函数为 private，这样该类就不会被实例化
	private SingletonHunger() {
	}

	// 获取唯一可用的对象
	public static SingletonHunger getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World! " + instance.getClass().getSimpleName());
	}
}