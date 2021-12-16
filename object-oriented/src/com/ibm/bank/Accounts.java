package com.ibm.bank;

/**
 * this class represents generalised bank account.
 * @author Ruksana Syed..
 * @version 1.0
 *
 */
public abstract class Accounts implements Bank {
	private int acnNo;
	private String holder;
	protected double balance;
	 
	
	
	private static int counter;
	//Executes at the time of class loading...
	static {//Static initialiser block, consider as constructor for static members
		//System.out.println("Accounts class Loaded...");
		counter=INIT_ACCOUNT_NO;
	}
	/**
	 * Default constructor
	 */
	public Accounts()
	{
	}
	/**
	 * Parameterised constructor for creating account.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acnNo=counter++;//acnNo;
		this.holder=holder;
		this.balance=balance;
		
	}
	/**
	 * Method to print account summary
	 */
	public void sumary() {
		System.out.println("A/C No:"+acnNo);
		System.out.println("Holder:"+holder);
		System.out.println("Balance:"+balance);
	}
	//BUSINESS LOGIC(BS)
	public void deposit(double amount) {
		balance+=amount;
	}
	public abstract void  withdraw(double amount) throws BalanceException, Exception ;
		//if(amount <=balance)
			//balance-=amount;
		//else
			//System.out.println("Insufficient Balance...");

}
