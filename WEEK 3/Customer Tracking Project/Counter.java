
//Represents a counter with methods for manipulating a count.

public class Counter {
	//instance vars
	
	//internal count for counter
	int count;
	
	public Counter(int initialCount) {
		this.setCount(initialCount);
	}
	//methods
	
	public void increment() {
		this.count++;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int count) {
		this.count=count;
	}
	
	public void decrement() {
		this.count--;
	}
}
