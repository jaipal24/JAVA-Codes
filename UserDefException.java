/*
Register a Candidate - User defined Exception(with throw and throws)
Geneva Technologies is planning to conduct a Walk-in interview. The interview has 4 levels. To attend the interview, the candidates need to register the following information:
Name, Gender and Expected salary.
Help him do this by writing a java program.
Partial code is provided.
You are provided with a public class Candidate with private attributes :
                        String name
                        String gender
                        double expectedSalary
            Appropriate getter and setters are provided.
            You are provided with a public class UserDefException.
Write a method getCandidateDetails as –
            public static Candidate getCandidateDetails() – This method should get the candidate details, create the Candidate object using those details and return that object.
If the candidate’s expected salary is less than 10000
               ·   throw a user defined exception as InvalidSalaryException with the message “Registration Failed. Salary cannot be less than 10000.” and return null.
               ·    this method should throw / propagate InvalidSalaryException.
To do this, write a class InvalidSalaryException that inherits Exception class.
Write a constructor that takes a String as argument and set this string to the message attribute of the super class, Exception.
In the UserDefException class, write the main method and test the method getCandidateDetails.
If it returns a valid Candidate object, then  display  “Registration Successful”.
Use a catch block to handle the exception that is returned by the method getCandidateDetails. In catch block display the message by using the getMessage() method.

Sample Input 1:
Enter the candidate Details
Name
Margrett
Gender
Female
Expected Salary
50000

Sample Output 1:
Registration Successful

Sample Input 2:
Enter the candidate Details
Name
Robin
Gender
Male
Expected Salary
5000

 Sample Output 2:
Registration Failed. Salary cannot be less than 10000.    
*/


public class Candidate {
	
	private String name;
	private String gender;
	private double expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
}

import java.util.*;
public class UserDefException
{
    public static void main(String[] args)
    {
        try
        {
            UserDefException m=new UserDefException();
            Candidate c1=m.getCandidateDetails();
            System.out.println("Registration successful");
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            
        }
    }
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate details");
        System.out.println("Name");
        String s1=sc.next();
         System.out.println("Gender");
        String s2=sc.next();
        System.out.println("Expected saary");
        double s3=sc.nextDouble();
        Candidate c=new Candidate();
        c.setName(s1);
        c.setGender(s2);
        c.setExpectedSalary(s3);
        if(s3<10000)
        {
            throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000");
        }
        return c;
    }
}

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String s)
    {
        super(s);
    }
}