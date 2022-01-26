package classroom;

//represents a student in the class
//each student has a name and id
public class Student {
	String name;
	String ID;
	
	public Student(String name,String ID) {
		this.name=name;
		this.ID=ID;
	}
	
	public String toString() {
		return this.name;
	}
	
}
