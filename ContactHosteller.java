/*
Contact Details of Hosteller
SNMR College of Engineering and Technology wants to create an application to store their students details as well as the details of hostellers.
In case of any changes to be made to the attributes,  admin can update the details like room number and phone number of the hosteler.
Develop a program to implement this scenario.
Create a public class Student with  protected attributes :
int studentId
String name
int departmentId
String gender
String phone

Create a public class Hosteller with private attributes
String hostelName
int roomNumber

Make this class inherit the Student class, as it holds all the properties of Student. 
Use appropriate public getters and setters for both the classes.
Write a class Main with the main function.
In Main class get the input of the hosteller using the method :
public static Hosteller getHostellerDetails().
Invoke this method from the main method and then modify the room number and phone number, if needed.

Sample Input 1:
Enter the Details:
Student Id
1
Student Name
John
Department Id
101
Gender
Male
Phone Number
9876543210
Hostel Name
YMCA
Room Number
10
Modify Room Number(Y/N)
Y
New Room Number
11
Modify Phone Number(Y/N)
Y
New Phone Number
9876543121

Sample Output 1:
The Student Details
1 John 101 Male 9876543121 YMCA 11

Sample Input 2:
Enter the Details:
Student Id
2
Student Name
John Paul
Department Id
112
Gender
Male
Phone Number
9885526536
Hostel Name
YMBA
Room Number
5
Modify Room Number(Y/N)
N
Modify Phone Number(Y/N)
N

Sample Output 2:
The Student Details:
2 John Paul 112 Male 9885526536 YMBA 5
*/

import java.util.*;
public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getDepartmentId()
    {
        return departmentId;
    }
    public void setDepartmentId(int departmentId)
    {
        this.departmentId=departmentId;
    }
    public String getGender()
    {
        return gender;
    }
   public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
}

public class Hosteller extends Student
{
    private String hostelName;
    private int roomNumber;
    
    public String getHostelName()
    {
        return hostelName;
    }
   public void setHostelName(String hostelName)
    {
        this.hostelName=hostelName;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber=roomNumber;
    }
}

import java.util.*;
public class ContactHosteller
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        ContactHosteller m=new ContactHosteller();
        Student s=new Student();
        Hosteller h=new Hosteller();
        m.getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        char modrno=sc.next().charAt(0);
        System.out.println("Modify Phone Number(Y/N)");
        char modpno=sc.next().charAt(0);
        
        
        if(modrno=='Y')
        {
            System.out.println("New Room Number");
        int newrno=sc.nextInt();
           h.setRoomNumber(newrno);
        }
        
        if(modpno=='Y')
        {
            System.out.println("New Phone Number");
        String newpno=sc.next();
            s.setPhone(newpno);
        }
        System.out.println("The Student Details");
        System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getDepartmentId()+" "+s.getGender()+" "+s.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
    }
    public static Hosteller getHostellerDetails()
    {
        Hosteller h1=new Hosteller();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int s1=sc1.nextInt();
        System.out.println("Student Name");
        String s2=sc1.nextLine();
        System.out.println("Department Id");
        int s3=sc1.nextInt();
        System.out.println("Gender");
        String s4=sc1.next();
        System.out.println("Phone Number");
        String s5=sc1.next();
        System.out.println("Hostel Name");
        String s6=sc1.next();
        System.out.println("Room Number");
        int s7=sc1.nextInt();
       
        h1.setStudentId(s1);
        h1.setName(s2);
        h1.setDepartmentId(s3);
        h1.setGender(s4);
        h1.setPhone(s5);
        h1.setHostelName(s6);
        h1.setRoomNumber(s7);
        return h1;
        
    }
}