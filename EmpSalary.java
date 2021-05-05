/*
Employee Salary Calculation

Create a class Employee with the following private member variables.
int employeeId
String employeeName
double salary
double netSalary
Include appropriate getters and setters method in Employee class. Write the following method in the Employee class:
public void calculateNetSalary(int pfpercentage)  - This method should take PF percentage as argument. Deduct the PF amount from the salary and set the netSalary.  

Create a Main class which has the main method which invokes the method to get the input and prints the details as shown in the sample. 

Also write a method :

   public static Employee getEmployeeDetails() -  which gets the employee details - id, name and salary, and returns the employee object.

public static int getPFPercentage() -  which gets the PF percentage and returns the same

In the main method invoke the above two methods, and then call the calculateNetSalary method in Employee class and print the output as shown below.

Sample Input 1:
Enter Id:
101
Enter Name:
Vivek
Enter salary:
20000
Enter PF percentage:
7

Sample Output 1:
Id : 101
Name : Vivek
Salary : 20000.0
Net Salary : 18600.0
*/

import java.util.*;
public class EmpSalary 
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        EmpSalary m=new EmpSalary();   
        //m.getEmployeeDetails(); 
        int l= m.getPFPercentage();
        e1.calculateNetSalary(l);
        System.out.println("Id : "+e1.getEmployeeId());
        System.out.println("Name : "+e1.getEmployeeName());
        System.out.println("Salary : "+e1.getSalary());
        System.out.println("Net Salary : "+e1.getNetSalary());
        
    }
    public static Employee getEmployeeDetails()
    {
        
        Scanner sc=new Scanner(System.in);
        
        Employee e2=new Employee();
        System.out.println("Enter Id:");
        int n1=sc.nextInt();
        System.out.println("Enter Name:");
        String s=(sc.next());
        System.out.println("Enter salary:");
        double d=sc.nextDouble();
       
        
        e2.setEmployeeId(n1);
        e2.setEmployeeName(s);
        e2.setSalary(d);
       return e2;
    }
    public static int getPFPercentage()
    { 
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int p=sc1.nextInt(); 
        return p;
    }
}

public class Employee
{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(int id)
    {
        this.employeeId=id;
    }public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String str)
    {
        this.employeeName=str;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double sal)
    {
        this.salary=sal;
    }
    public double getNetSalary()
    {
        return netSalary;
    }
    public void setNetSalary(double net)
    {
        this.netSalary=net;
    }
    public void calculateNetSalary(int pfpercentage)
    {
        setNetSalary(getSalary()-((getSalary()*pfpercentage)/100));
    }
}