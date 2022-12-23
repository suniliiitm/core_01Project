package sp.factory.pattern;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer >al4=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			al4.add(i*10);
		}
		System.out.println(al4);
		al4.remove(1);
		al4.remove(2);
		System.out.println(al4);
	}

}
