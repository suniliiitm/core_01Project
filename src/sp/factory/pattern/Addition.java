package sp.factory.pattern;

public class Addition implements Calculator{

	@Override
	public String calculaatorService(int a, int b) {
		
		int c= a+b;
		
		return "Add result is :"+c;
	}
	
	

}
