package design.DP.Creational.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		
		//Singleton Class will not create a new object, it will always return the same object to everyone.
		SingletonClass sc = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
		SingletonClass sc3 = SingletonClass.getInstance();
		
		//Hashcode will be same for all the objects
		sc.method1();
		sc2.method1();
		sc3.method1();
		
		//Ways to break Singleton Pattern
		//1st way using Reflection
		System.out.println("\n-----1. Breaking using Reflection------");
		//to get hold of class
		Class<?> singletonClass = Class.forName("design.DP.Creational.Singleton.SingletonClass");
		Constructor<SingletonClass> constructor = (Constructor<SingletonClass>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		SingletonClass brokenSingletonReflectionInstance = constructor.newInstance();
		brokenSingletonReflectionInstance.method1();
		
		
		//2nd Way 
		//Using Serialization
		System.out.println("\n-----2. Breaking using Serialization------");
		
		//Serialization Process
		ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\vivemeht\\OneDrive - Qualcomm\\Desktop\\Personal\\Seralization.ser"));
		outStream.writeObject(sc);
		outStream.close();
		
		//DeSerialize
		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("C:\\Users\\vivemeht\\OneDrive - Qualcomm\\Desktop\\Personal\\Seralization.ser"));
		SingletonClass brokenSingletonSerializationInstance = (SingletonClass)inStream.readObject();
		brokenSingletonSerializationInstance.method1();
		
		//3rd Way
		//Using cloning
		System.out.println("\n-----3. Breaking using Cloning------");
		SingletonClass brokenSingletonCloningInstance = (SingletonClass)sc.clone();
		brokenSingletonCloningInstance.method1();
		
		
	}
}
