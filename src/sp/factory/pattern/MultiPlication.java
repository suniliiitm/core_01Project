package sp.factory.pattern;

public class MultiPlication implements Calculator{

	@Override
	public String calculaatorService(int a, int b) {

			int c = a*b;
		return "Multiplication result is :"+c;
	}

}
