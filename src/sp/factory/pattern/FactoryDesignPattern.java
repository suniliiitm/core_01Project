package sp.factory.pattern;

import java.sql.SQLException;

public class FactoryDesignPattern {

	public static void main(String[] args)throws SQLException  {
		
	
	Calculator cal=	KL.getFactoryObject("Please enter two value");
	
	String res=cal.calculaatorService(100, 25);
	System.out.println(""+res);
	
	System.out.println("Hi AArti");
	}
	
	
}

