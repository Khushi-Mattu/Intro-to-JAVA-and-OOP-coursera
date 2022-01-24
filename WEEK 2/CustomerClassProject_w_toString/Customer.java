
public class Customer {
	//instance var
	
		// Name of customer.
		 
		String name;
		
		//constructor
		
		public Customer(String name) {
			this.name = name;
		}
		
		
		 // Returns name of customer.

		public String toString() {
			return this.name; // returns name of customer to be printed by Java
		}
		
		public static void main(String[] args) {
			Customer c = new Customer("Khushii");
			System.out.println("c = " + c); //this will try to convert customer c to a String by calling the toString method
		}
}
