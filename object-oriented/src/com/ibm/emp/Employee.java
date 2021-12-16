package com.ibm.emp;
/**
 * this class represents generalised employee details
 * @author Ruksana Syed
 * @version 1.0.
 */
public class Employee {
	private int empno;
	private String empname;
	private double salary;
	private static int counter=101;
	
	public Employee(String empName2, double salary2)
	{
		//Calling another constructor on the same object with matching signature
		this(-1,"Anonymous",-1);//Constructor chaining.....
	}
	
	public Employee(int empno,String empname, int salary ) {
		super();
		this.empno = empno;
		this.empname= empname;
		this.salary=salary;
		
	}
	/**this is the method to generate payslip. 
	 * 
	 */
	public void payslip()
	{
		System.out.println("empno:" + empno );
		System.out.println( "Empname:" + empname);
		System.out.println( "salary:" + salary);
	}
	public double getSalary() {
		return salary;
	}
	
}
