/*
Visitors Details
VIP group of companies introduce a new shopping mall “Le Le” . To promote the mall they had approached  “6th Event” a famous commercial event organizer to organize an event of lucky draw. The organizer has to collect name, phone and email id of all the visitors during promotion time and give it to the company.
The organizer needs an automated application and wants to store records in a text file called “visitors.txt”. 
Records should to be stored in the following structure
Name1,phonenumber1,emailId1;Name2,phonenumber2,emailId2;
In a record, each attributes should be separated using comma (,) and records should be separated using semi colon (;). 
Create a Java Application which has two classes called Main.java and FileManager.java
In FileManager class implement the following methods [method skeletons are given]
static public File createFile() – This method should create the file and return it.
static public void writeFile(File f, String record) – In the method, first parameter is the file reference in which records to be added  and second parameter is a record, This record should append in the file. [Record should be as per the given format]
static public String[] readFile(File f) – This method accept file to be read, returns all records in the file.
[Note : Don’t modify the signature of the given methods]
In Main class use the following Input and Output statements and call the needed methods from FileManager class to manipulate files.
Enter Name
John
Enter Phone Number
1234567
Enter Email
johnpeter@abc.com
Do you want to enter another record(yes/no)
yes
Enter Name
Grace
Enter Phone Number
98765412
Enter Email
gracepaul@xyz.com
Do you want to enter another record(yes/no)
no
John,1234567,johnpeter@abc.com
Grace,98765412,gracepaul@xyz.com
*/

//import necessary packages
 import java.io.*;
 import java.lang.*;
 import java.util.*;
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
    static public File createFile()
    {
    File myObj=new File("visitors.txt");
    try{
        myObj.createNewFile();
    }
    catch(IOException e)
    {
        
    }
    return myObj;//change the return type as per the requirement    
    }
    static public void writeFile(File f, String record)
	{ 
	    FileWriter fs=null;
	    try { 
            fs=new FileWriter(f,true);
            fs.append(record);
            fs.close();
        } 
        catch (IOException e) { 
            System.out.println(e); 
        } 
	} 
	static public String[] readFile(File f)
	{
	    String s[]=new String[100];
	    try{
	    int i=0;
        BufferedReader br = new BufferedReader(new FileReader(f)); 
        String st = ""; 
        while ((st=br.readLine()) != null) 
        {
            s=st.split(";");
            
        }
	    }
	    catch(FileNotFoundException e)
	    {
	        
	    }
	    catch(IOException e1)
	    {
	        
	    }
        //change the return type as per the requirement  
        return s;
	}
 }
 
 //import necessary packages
import java.util.*;
import java.io.*;
 @SuppressWarnings("unchecked")//Do not delete this line
public class VisitorDetails
{
	public static void main(String[] args) throws Exception
	{
	    String s4;
	    FileManager f=new FileManager();
	    File f1=f.createFile();
	    Scanner sc=new Scanner(System.in);
	    do
	    {
	        System.out.println("Enter Name");
	        String s1=sc.next();
	        System.out.println("Enter Phone Number");
	        long s2=sc.nextLong();
	        System.out.println("Enter Email");
	        String s3=sc.next();
	        String s=s1+","+s2+","+s3+";";
	        f.writeFile(f1,s);
	        System.out.println("Do you want to enter another record(yes/no)");
	        s4=sc.next();
	        
	    }while(s4.equals("yes"));
	    String s0[]=f.readFile(f1);
	     for(String so:s0)
	        {
	            System.out.println(so);
	        }
	}
    
}