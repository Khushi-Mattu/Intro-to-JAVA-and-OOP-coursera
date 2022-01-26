package classroom;

//represents a seat in a classroom
//each seat has a row and column associated with it
public class Seat {
	
	//instance vars
	
	int row;
	int column;
	
	//student assigned to this seat otherwise null
	Student studentInSeat;
	//constructor
	//creates a seat for a class at a given row and column
	public Seat(int row,int column) {
		this.row=row;
		this.column=column;
		
		
	}
	
	public void putStudentInSeat(Student student) {
		this.studentInSeat=student;
	}
	
	public String toString() {
		return this.row+","+this.column+": "+this.studentInSeat;
		//this will also call the to string in the student class
	}
	
	
	
}
