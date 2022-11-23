package sp.factory.pattern;

public class KL {
public static Calculator getFactoryObject(String s) {
		
		Calculator ob=null;
		if(s.equals(ob +"+"))
		{
			ob =new Addition();
		}else if(s.equals(ob +"*")) {
			ob = new MultiPlication();
		}else if(s.equals(ob +"/")) {
			ob = new Division();
		}else if(s.equals(ob +"-")) {
			ob = new Subtraction();
		}
		
		
		return ob;
		
	}

}
