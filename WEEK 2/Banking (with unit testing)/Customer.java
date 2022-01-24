package Banking;
/**
 * Represents a customer of a bank.
 *
 */
public class Customer {
	//instance vars
	//name of the customer
	String name;
	//address of the customer
	String address;
	//constructor
	//creates a customer with the given name
	
	public Customer(String name) {
		// sets instance var name to given name
		this.name=name;
	}
	//methods
	public void setAddress(String address) {
		this.address=address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		//this refers to this instance of the class
		//address is instance variable address
		return this.address;
	}
}
