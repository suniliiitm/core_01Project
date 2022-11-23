package sp.factory.pattern;

public class Subtraction implements Calculator{

	@Override
	public String calculaatorService(int a, int b) {
		int c =a-b;
		return "Subtraction result is :"+c;
	}

}
