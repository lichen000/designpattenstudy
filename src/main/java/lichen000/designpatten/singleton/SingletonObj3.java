package lichen000.designpatten.singleton;

/**
 * 单例模式3，不支持懒加载，多线程安全，最通用的方式，无特殊需求推荐使用此方式
 * Created by chen.li200 on 2018-01-09
 */
public class SingletonObj3 {

	//创建 SingletonObj 的一个对象
	private static SingletonObj3 instance = new SingletonObj3();

	//让构造函数为 private，这样该类就不会被实例化
	private SingletonObj3(){
		//必须要设为private
	}

	/**
	 *
	 * @return
	 */
	//获取唯一可用的对象
	public static SingletonObj3 getInstance(){
		return instance;
	}

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton3");
	}
}
