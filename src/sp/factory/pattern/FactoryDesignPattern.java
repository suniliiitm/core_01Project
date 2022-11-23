package sp.factory.pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
	
	Calculator cal=	KL.getFactoryObject(s);
	
	String res=cal.calculaatorService(100, 25);
	System.out.println(""+res);
	
	}
	
	
}

