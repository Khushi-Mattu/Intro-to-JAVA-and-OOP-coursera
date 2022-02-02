//represents a point with x and y
public class Point {

	//x and y for point and sum for sum of x and y
	
	int x;
	int y;
	int sum;
	
	//constructors
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		this.sum=x+y;
	}
	
	public Point() {
		this(0,0);
		//calls first constructor with default values 0 and 0
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1= new Point(2,4);
		System.out.println(point1.x);
		System.out.println(point1.y);
		System.out.println(point1.sum);
		
		Point point2=new Point();
		System.out.println(point2.x);
		System.out.println(point2.y);
		System.out.println(point2.sum);
	}

}
