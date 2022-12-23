package sp.factory.concurency;

public class Concurency {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		c.incremnet();
		c.incremnet();
		c.incremnet();
		System.out.println(c.getI());
	}

}
