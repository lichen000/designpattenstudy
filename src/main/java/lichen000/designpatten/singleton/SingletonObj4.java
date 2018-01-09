package lichen000.designpatten.singleton;

/**
 * 单例模式4，支持懒加载，多线程安全，基于双重校验锁实现，比较复杂
 * Created by chen.li200 on 2018-01-09
 */
public class SingletonObj4 {

	private volatile static SingletonObj4 singleton; //加上了volatile关键字

	private SingletonObj4 (){

	}

	/**
	 *
	 * @return
	 */
	public static SingletonObj4 getInstance() {
		if (singleton == null) {
			synchronized (SingletonObj4.class) {
				if (singleton == null) {
					singleton = new SingletonObj4();
				}
			}
		}
		return singleton;
	}

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton4");
	}
}
