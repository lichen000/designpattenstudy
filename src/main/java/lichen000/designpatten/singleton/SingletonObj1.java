package lichen000.designpatten.singleton;

/**
 * 单例模式1，支持懒加载，多线程不安全
 * Created by chen.li200 on 2018-01-09
 */
public class SingletonObj1 {

	//创建 SingletonObj 的一个对象
	private static SingletonObj1 instance;

	//让构造函数为 private，这样该类就不会被实例化
	private SingletonObj1(){
		//必须要设为private
	}

	/**
	 *
	 * @return
	 */
	//获取唯一可用的对象
	public static SingletonObj1 getInstance(){
		if (instance == null) {
			instance = new SingletonObj1();
		}
		return instance;
	}

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton1");
	}
}
