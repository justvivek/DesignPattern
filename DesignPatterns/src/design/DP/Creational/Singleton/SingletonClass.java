package design.DP.Creational.Singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void method1() {
		System.out.println("HashCode of Singletonclass Instance is:- "+ this.hashCode());
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
