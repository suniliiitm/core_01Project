package sp.factory.pattern;

import java.lang.reflect.Constructor;

public class TestCase {

	public static void main(String[] args) throws Exception {
		
		SingletonDesignPattern sdp = SingletonDesignPattern.getInstance();
		System.out.println(""+sdp.hashCode());
		SingletonDesignPattern sdp1 = SingletonDesignPattern.getInstance();
		System.out.println(""+sdp1.hashCode());
		SingletonDesignPattern sdp2 = SingletonDesignPattern.getInstance();
		System.out.println(""+sdp2.hashCode());
		
		//Reflection
		Constructor<SingletonDesignPattern> sdp3 =SingletonDesignPattern.class.getDeclaredConstructor();
		sdp3.setAccessible(true);
		SingletonDesignPattern obj=sdp3.newInstance();
		System.out.println(""+obj.hashCode());
		System.out.println(""+sdp3.hashCode());
		//DeSerialization
		//Cloning
		//Multithreading
		
		
		//SingletonDesignPattern sdp = new SingletonDesignPattern(); becoz constructor is a private,we should make a static method 
		
		
		/*
		 * SingletonDesignPattern sdp = new SingletonDesignPattern();
		 * System.out.println(""+sdp.hashCode());
		 * 
		 * SingletonDesignPattern sdp1 = new SingletonDesignPattern();
		 * System.out.println(""+sdp1.hashCode());
		 * 
		 * SingletonDesignPattern sdp2 = new SingletonDesignPattern();
		 * System.out.println(""+sdp2.hashCode());
		 */

	}

}
