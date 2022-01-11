package Banking;

/**
 * Represents a checking/savings bank account for a customer.
 *
 */

public class BankAccount {
	//instance vars
	//type of account (checking/savings)
	String accountType;
	//balance for bank account
	double balance;
	//customer for this account
	Customer customer;
	
	//constructor
	public BankAccount(String accountType,Customer customer) {
		//creates a bank type for given customer
		this.accountType=accountType;
		this.customer=customer;
	}
	
	//methods
	//deposits the given amount
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	public void withdraw(double amount) throws Exception {
		if(amount>this.balance) {
			throw new Exception("Amount is greater than available balance");
		}
		this.balance-=amount;
	}
	
	public String getAccountInfo() {
		return this.accountType+": "+this.balance;
	}
	
	public String getCustomerInfo() {
		return this.customer.getName()+" from "+this.customer.getAddress();
	}
}
