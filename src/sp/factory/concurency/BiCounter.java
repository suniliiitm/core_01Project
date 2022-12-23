package sp.factory.concurency;

public class BiCounter {
	
	private int i=0;
	private int j=0;
	synchronized public void incrementI() {
		i++;
		//get i
		//increment
		//set i
		
	}
			public int getI() {
				return i;
			}
	

}
