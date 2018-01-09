package lichen000.designpatten.singleton;

/**
 * 单例模式2，支持懒加载，多线程安全
 * Created by chen.li200 on 2018-01-09
 */
public class SingletonObj2 {

	//创建 SingletonObj 的一个对象
	private static SingletonObj2 instance;

	//让构造函数为 private，这样该类就不会被实例化
	private SingletonObj2(){
		//必须要设为private
	}

	/**
	 *
	 * @return
	 */
	//获取唯一可用的对象
	public static synchronized SingletonObj2 getInstance(){
		if (instance == null) {
			instance = new SingletonObj2();
		}
		return instance;
	}

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton2");
	}
}
