package sp.factory.concurency;

public class Counter {
	
	int i=0;
	synchronized public void incremnet() {
		i++;//15
		//get i 15 15
		//increment 16
		//set i 16
		
		
	}
	public int getI() {
		return i;
	}
	

}
