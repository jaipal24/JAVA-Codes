/*
Average and Grade Calculation
Develop a smart application as Student Grade Calculator(SGC).
Create a class Student with following private attribute :
int id, String name, marks(integer array), float average and char grade. Include appropriate getters and setters methods and constructor.
public  void calculateAvg()- This method should calculate average and set average mark for the current student.
public void findGrade()- This method should set the grade based on the average calculated. If the average is between 80 and 100 then, then return grade as 'O', else 'A' .If the student gets less than 50 in any of the subjects then return grade as 'F'. Using appropriate setter method set the grade to the student.
(Note : number of subject should be greater than zero, if not display as 'Invalid number of subject' and get number of subject again, Assume mark for a subject should be in the range 0 - 100.  If not display a message "Invalid Mark" and get the mark again)
Write a class AvgGrade and write the main method.
In this class, write a method
public static Student getStudentDetails() - this method should get the input from the user for a student, create a student object with those details and return that object.
In main create student’s object by invoking the getStudentDetails method.  Also calculate average and grade for that student object using appropriate methods.
SGC app should get the input and display the output as specified in the snapshot:

Sample Input 1:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
3
Enter mark for subject 1:
95
Enter mark for subject 2:
80
Enter mark for subject 3:
75

Sample Output 1:
Id:123
Name:Tom
Average:83.33
Grade:O

Sample Input 2:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
0
Invalid number of subject
Enter the no of subjects:
3
Enter mark for subject 1:
75
Enter mark for subject 2:
49
Enter mark for subject 3:
90

Sample Output 2:
Id:123
Name:Tom
Average:71.33
Grade:F
*/

public class Student
{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    public int[] getMarks()
    {
        return marks;
    }
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    
    public float getAverage()
    {
        return average;
    }
    public void setAverage(float average)
    {
        this.average=average;
    }
    
    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char grade)
    {
        this.grade=grade;
    }
    
    public Student(int id,String name,int[] marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    
    
    public void calculateAvg()
    {
        float avg=0;
        int[] arr=getMarks();
        for(int i=0;i<arr.length;i++)
        {
            avg=avg+arr[i];
        }
        setAverage(avg/(arr.length));
    }
    
    public void findGrade()
    {
        float avg=getAverage();
        int[] arr1=getMarks();
        int c=0,i;
        for(i=0;i<arr1.length;i++)
        {
            if(arr1[i]<50)
            c++;
        }
        if(c>0)
        setGrade('F');
        else if(avg>=80&&avg<=100)
        setGrade('O');
        else 
        setGrade('A');
        
    }
}

import java.util.*;
public class AvgGrade
{
    public static void main(String[] args)
    {
        AvgGrade sm=new AvgGrade();
        sm.getStudentDetails();
    }
    
    
    public static Student getStudentDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id:");
        int id1=sc.nextInt();
        System.out.println("Enter the name:");
        String nam=sc.next();
        int n;
        int ar[]=new int[10]; 
        while(true)
        {
            System.out.println("Enter the no of subjects:");
            n=sc.nextInt();
            if(n<=0)
            System.out.println("Invalid number of subject");
            else
            {
                for(int i=1;i<=n;i++)
                {
                    System.out.printf("Enter mark for subject %d:",i);
                    ar[i]=sc.nextInt();
                }
                break;
            }
        }
        
        Student s=new Student(id1,nam,ar);
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+s.getAverage());
        System.out.println("Grade:"+s.getGrade());
        return s;
    }
    
}