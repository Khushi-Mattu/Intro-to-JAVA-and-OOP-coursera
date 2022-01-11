package Banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 *
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new instance of the bank class
		Bank bank = new Bank();
		//calls the run method in the bank class
		bank.run();

	}
	//Runs the program by initializing and managing bank accounts and customers
	
	public void run() {
		System.out.println("Welcome to the bank! What is your name?");
		Scanner scan= new Scanner(System.in);
		String name=scan.next();
		
		System.out.println("Hello "+name+"! WE are creating checking and savings account for you");
		//creates customer with given name
		Customer customer =new Customer(name);
		System.out.println("What is your address? ");
		String address=scan.next();
		//set the customer's address
		customer.setAddress(address);
		
		//create a checking account
		BankAccount checkingAccount=new BankAccount("checking",customer);
		//create a savings account
		BankAccount savingsAccount =new BankAccount("saving",customer);
		
		//gets and prints customer info associated with the checking acount
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		System.out.println("Checking Account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings Account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		
		//into checking
		
		System.out.println(); //blank line
		System.out.println("Amount (decimal) to deposit into checking account?");
		double amount=scan.nextDouble();
		checkingAccount.deposit(amount);
		
		//into savings
		System.out.println("Amount (decimal) to deposit into savings account?");
		amount=scan.nextDouble();
		savingsAccount.deposit(amount);
		
		System.out.println("Checking Account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings Account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdrawals
		
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from checking account?");
		amount=scan.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//into savings
		System.out.println("Amount (decimal) to withdraw from savings account?");
		amount=scan.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Checking Account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings Account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		scan.close();
	}

	

}
