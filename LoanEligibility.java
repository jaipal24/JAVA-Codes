/*
Employee Loan Eligibility - Polymorphism
Global Engineering is one of the fastest growing company. It needs to automate the transactions performed in the organization.  As start up, they need to automate the Employee management system. 

Partial code is provided to do this. Don’t change the skeleton. Do the additions wherever necessary.

You are provided with a public class Employee with protected attributes :

                                  int employeeId

                                  String employeeName

                                   double salary

       Appropriate public getters and setters are already written.

Write a public 2 argument constructor with arguments – employeeId,and employeeName.

Write a public abstract method calculateSalary()  in Employee class as,     

            public abstract void calculateSalary()

You are provided with a public class PermanentEmployee with private attribute : 

                double basicPay

       Appropriate public getters and setters are already written.

 Make this class PermanentEmployee to inherit the Employee class.

Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  

Implement the calculateSalary method in Employee class as

    salary = basicPay – PF amount

Here PF Amount = basicPay * 0.12; Set this value to the salary attribute.

You are provided with a public class TemporaryEmployee with private attribute : 

                int  hoursWorked

                int hourlyWages

     Appropriate public getters and setters are already written.

This class TemporaryEmployee should inherit the Employee class.

Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  

Implement the calculateSalary method in Employee class as

        salary = hoursWorked * hourlyWages

Set this value to the salary attribute.

You are provided with a public class Loan

A method calculateLoanAmount is provided as shown below :

public double calculateLoanAmount(Employee employeeObj)

This method should calculate the loan amount and return that amount. 

Provide the implementation for this method as mentioned below

Loan amount is calculated as follows :

If the Employee object is of type PermanentEmployee the loan amount should be 15%  of the salary.  

If the Employee object is of type TemporaryEmployee the loan amount should be 10%  of the salary.

You are provided with a public class Main which has the main method.  

Check the correctness of the methods written in these classes.

Note :  All class, methods needs to be declared as public
*/

public abstract class Employee
{
	protected int employeeId;
    protected String employeeName;
    protected double salary;
    
    //Getters and Setters
  	public int getEmployeeId() {
  		return employeeId;
  	}
  	public void setEmployeeId(int employeeId) {
  		this.employeeId = employeeId;
  	}
  	public String getEmployeeName() {
  		return employeeName;
  	}
  	public void setEmployeeName(String employeeName) {
  		this.employeeName = employeeName;
  	}
  	public double getSalary() {
  		return salary;
  	}
  	public void setSalary(double salary) {
  		this.salary = salary;
  	}
  	
  	
    //Write a public 2 argument constructor with arguments – employeeId,and employeeName
    public Employee(int employeeId,String employeeName)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    
    public abstract void calculateSalary();
    
    
    
     
    //Write a method -  public void calculateSalary()
	//Make this method as abstract
	
}

//Make this class inherit the Employee class

public class PermanentEmployee extends Employee
{
    private double basicPay;
    
    // Getters and Setters
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    
    public PermanentEmployee(int employeeId,String employeeName,double basicPay)
    {
        super(employeeId,employeeName);
        this.basicPay=basicPay;
    }
    
    
	
	//2. Implement the  - public void calculateSalary() - method   
	public void calculateSalary()
	{
	    double sal=basicPay-basicPay*0.12;
	    setSalary(sal);
	}
    
	
	//2. Implement the  - public void calculateSalary() - method   
    
    
    
}

//Make this class inherit the Employee class

public class TemporaryEmployee extends Employee {
	
	private int  hoursWorked;
	private int hourlyWages;
	
	// Getters and Setters
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	//1. Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  
	
	public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages)
	{
	    super(employeeId,employeeName);
	    this.hourlyWages=hourlyWages;
	    this.hoursWorked=hoursWorked;
	}
	
	
	
	//2. Implement the  - public void calculateSalary() - method  
	public void calculateSalary()
	{
	    double salar=hoursWorked*hourlyWages;
	    setSalary(salar);
	}
	
	
	//2. Implement the  - public void calculateSalary() - method  
	
	
	
}


public class Loan {
	
	//Implement the below method 
	
	//public double calculateLoanAmount(Employee employeeObj) {
		
	//}
	public double calculateLoanAmount(Employee employeeObj) {
	    double sa;
	    if(employeeObj.getClass().getSimpleName().equals("PermanentEmployee"))
	    {
	      return (employeeObj.getSalary()*15)/100;
	    }
	    else
	      return (employeeObj.getSalary()*10)/100;
	}

}

import java.util.Scanner;
public class LoanEligibility{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
    }
    
}