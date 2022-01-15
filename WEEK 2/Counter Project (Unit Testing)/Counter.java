package Counter;

public class Counter {
		// TODO Auto-generated method stub
		int count=0;
		//increments internal count and return new value of internal count
		public int increment() {
			this.count++;
			
			return this.count;
		}
		//decrements internal count and returns new value of internal count
		public int decrement() {
			this.count--;
			
			return this.count;
		}
		
		//returns current value of count
		public int getCount() {
			return this.count;
		}
	
}
