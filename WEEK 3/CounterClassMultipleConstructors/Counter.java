
public class Counter {

	int count;
	
	//constructors
	
	//creates a counter and starts internal count at given start value
	public Counter(int start) {
		this.count=start;
	}
	
	//creates a counter and starts internal count at 0
	public Counter() {
		this.count=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter1=new Counter(2);
		System.out.println(counter1.count);
		
		Counter counter2=new Counter();
		System.out.println(counter2.count);
		
		
	}

}
