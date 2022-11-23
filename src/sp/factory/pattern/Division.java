package sp.factory.pattern;

public class Division implements Calculator {

	@Override
	public String calculaatorService(int a, int b) {

		int c=a/b;
		
		return "Division result is :"+c;
	}

	
}
