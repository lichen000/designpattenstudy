package lichen000.designpatten.singleton;

/**
 * 单例模式6，不支持懒加载，多线程安全，基于枚举类型实现
 * Created by chen.li200 on 2018-01-09
 */
public enum SingletonObj6 {

	INSTANCE;

	/**
	 *
	 */
	public void showMessage(){
		System.out.println("Hello World! Singleton6");
	}
}