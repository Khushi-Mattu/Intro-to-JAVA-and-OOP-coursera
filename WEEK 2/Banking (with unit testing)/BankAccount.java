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
	
	//fixed amount for quick withdrawals.
	double fastCashAmount;
	
	//constructor
	public BankAccount(String accountType,Customer customer) {
		//creates a bank type for given customer
		this.accountType=accountType;
		this.customer=customer;
		
		//set initial default value  for fast cash amount
		this.fastCashAmount=60;
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
	
	public void fastWithdraw() throws Exception {
		
		//withdraw the given fast cash amount
		this.withdraw(this.fastCashAmount);
	}
	
	//sets the fast cash amount if greater than 0
	public void setFastCashAmount(double amount) {
		if(amount>0) {
			this.fastCashAmount=amount;
		}
	}
	
	public String getAccountInfo() {
		return this.accountType+": "+this.balance;
	}
	
	public String getCustomerInfo() {
		return this.customer.getName()+" from "+this.customer.getAddress();
	}
}
