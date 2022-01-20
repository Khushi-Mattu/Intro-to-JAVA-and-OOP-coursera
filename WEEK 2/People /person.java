package People;
//Represents a person

public class person {
	String name;
	int age;
	
	//creates a person with given name and age
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//compares instances of person based on name
	//If two people have the same name they are equal
	public boolean equals(Object something) {
		
		//cast given object to Person
		person otherPerson=(person) something;
		
		//returns true if names of two people are same
		return this.name.equals(otherPerson.name);
	
	}
}
