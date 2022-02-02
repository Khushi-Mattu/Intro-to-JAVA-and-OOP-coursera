import java.util.ArrayList;

//represents a customer with name, ID and geography
public class Customer {

	//static variables shared across all instances of Customer
	static final String COMPANY="CVS";
	//stores list of all customers
	static ArrayList<Customer> CUSTOMERS= new ArrayList<Customer>();
	// to generate and keep track of customer IDs
	static Counter COUNTER;
	
	//instance vars
	String name; //name if customer
	String geography; //geography of customer
	int ID;
	
	//constructor
	
	public Customer(String name, String geography) {
		this.name=name;
		this.geography=geography;
		
		this.ID= Customer.COUNTER.getCount();
		//gets unique id from counter
		
		Customer.COUNTER.increment();
		
		//this is a reference to this customer
		Customer.CUSTOMERS.add(this);
		
	}
	
	//methods
	
	public static void printAllCustomers() {
		System.out.println("All Customers: ");
		for(Customer c: Customer.CUSTOMERS) {
			System.out.println(c);
		}
		System.out.println("\n");
	}
	
	public boolean equals(Object obj) {
		Customer otherCustomer=(Customer) obj;
		if((this.name.equals(otherCustomer.name)) && (this.geography.equals(otherCustomer.geography))){
			return true;
		}
		return false;
		}	
	
	public String toString() {
		return this.ID+": "+this.name+", Company: "+Customer.COMPANY+", Location: "+this.geography;
		
	}
	
	public static int findCustomer(Customer customer) {
		
		//set default index
		int index=-1;
		
		//iterate over customer list and locate given customer
		for(int i=0;i<Customer.CUSTOMERS.size();i++) {
			if(Customer.CUSTOMERS.get(i).equals(customer)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public static void removeCustomer(Customer customer) {
		int removeIndex=Customer.findCustomer(customer);
		if(removeIndex>=0) {
			Customer.CUSTOMERS.remove(removeIndex);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the counter for generating unique IDs for each customer
				Customer.COUNTER = new Counter(1);
				
				//create customer
				Customer c1 = new Customer("Khushi", "Mumbai");
				
				//print all customers
				Customer.printAllCustomers();
				
				//create customer
				Customer c2 = new Customer("Mishti", "Bangalore");
				
				//print all customers
				Customer.printAllCustomers();
				
				//create customer
				Customer c3 = new Customer("Taehyung", "Korea");
				
				//print all customers
				Customer.printAllCustomers();
				
				//remove customer
				Customer.removeCustomer(c1);
				
				//print all customers
				Customer.printAllCustomers();
				
				System.out.println("Location of "+c3.name+" is: "+  Customer.findCustomer(c3));
				System.out.println("Location of "+c2.name+" is: "+  Customer.findCustomer(c2));
	}

}
