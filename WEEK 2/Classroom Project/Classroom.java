package classroom;
import java.util.ArrayList;

//represents a classroom with students
//Each classroom has a list of students and an array of seats
public class Classroom {

	String buildingName;
	
	//name of classroom
	String roomName;
	
	ArrayList<Student> students;
	
	//seats in the classroom
	Seat[][] seats;
	
	//constructor
	//creates a classroom with given building name,roomname, no of rows and columns of seats
	public Classroom(String buildingName,String roomName,int rows,int columns) {
		this.buildingName=buildingName;
		this.roomName=roomName;
		this.seats=new Seat[rows][columns];
		
		//populate seats array with instances of seat class
		
		//iterate over rows
		for(int i=0;i<rows;i++) {
			//iterate over columns
			for(int j=0;j<columns;j++) {
				
				//give each location its own new instance of seat class
				seats[i][j]=new Seat(i, j);
				
			}
		}
		this.students=new ArrayList<Student>();
		
	}
	
	//adds given student to list
	public void addAStudent(Student student) {
		this.students.add(student);
	}
	
	//finds an available seat and assign it to the given student
	public void assignStudentToSeat(Student student) {
		int rows=this.seats.length;
		int columns=this.seats[0].length;
		//iterate over rows and columns
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				//get seat in location and see if it is available by checking if there is a student in the seat
				if(this.seats[i][j].studentInSeat==null) {
					this.seats[i][j].putStudentInSeat(student);
					return; //exits the loop as well as method
					
				}
			}
		}
	}
	
	public void printAllStudents() {
		System.out.println("Students is class: ");
		for (Student student:this.students) {
			System.out.println(student);
		}
	}
	
	public String toString() {
		String s="\n";
		
		int rows=this.seats.length;
		int columns=this.seats[0].length;
		//iterate over rows and columns
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				s+=this.seats[i][j]+"\t";
				//it will call the toString method in Seat class
			}
			s+="\n";//adds new line at end of each row
		}
		return s;
	}
	
	public static void main(String[] args) {
		Classroom hunstman =new Classroom("HH","105",10,5);
		
		Student harry=new Student("harry","harrysty");
		Student bob=new Student("bob","roberts");
		
		hunstman.addAStudent(harry);
		hunstman.addAStudent(bob);
		
		hunstman.assignStudentToSeat(harry);
		hunstman.assignStudentToSeat(bob);
		
		hunstman.printAllStudents();
		
		System.out.println(hunstman);//this will also call the tostring method in the classroom class
	}

}
