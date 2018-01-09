package lichen000.designpatten.singleton;

/**
 * 单例模式5，支持懒加载，多线程安全，基于内部类实现
 * Created by chen.li200 on 2018-01-09
 */
public class SingletonObj5 {

	private static class SingletonHolder {
		private static final SingletonObj5 INSTANCE = new SingletonObj5();
	}

	private SingletonObj5 (){

	}

	/**
	 *
	 * @return
	 */
	public static SingletonObj5 getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton5");
	}
}