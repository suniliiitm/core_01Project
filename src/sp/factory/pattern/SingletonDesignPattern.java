package sp.factory.pattern;

public final class SingletonDesignPattern {
		
	//class loader object is created
	//static SingletonDesignPattern sdp =new SingletonDesignPattern();//Eager initialization
	/*
	 * static SingletonDesignPattern getInstance() { return sdp;
	 * 
	 * }
	 */
	//Lazy inintialization
	static SingletonDesignPattern sdp=null;//Lazy Initialization 
	

	private SingletonDesignPattern() throws Exception{
		System.out.println("i am private constructor");
	}
	

	 SingletonDesignPattern(int i) throws Exception{
		
	}
	
	static SingletonDesignPattern getInstance() throws Exception {
		if(sdp==null) {
			sdp = new SingletonDesignPattern();
		}
		return sdp;
		
		
	}
	
	{
		//Instance Initialiser  block in java 
		if(sdp!=null)
			throw new Exception("Object is allready present");
		
	}
	
	void m1() {
		System.out.println("i am m1 instance");
	}
}
