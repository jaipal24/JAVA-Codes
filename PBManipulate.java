/*
PhoneBook Manipulation
Airone mobile services needs to store their customer details in the company portal. The details are customer's first and last name, phone number, and email address. Help the company develop an application to maintain the details of their customer systematically. 
You are provided with a class Contact with the following attributes as private.
String firstName
String lastName
long  phoneNumber
String emailId
A 4 argument constructor and appropriate setters and getters to store and retrieve the details are also provided.
Create a class PhoneBook with a private attribute
List<Contact> phoneBook = new ArrayList<Contact>();
Write the getters and setters.
Write the following methods in the PhoneBook class.
public void addContact(Contact contactObj) – This method should add the contact object to the phoneBook list.
public List<Contact> viewAllContacts() – This method should return the list of all contacts available.
public Contact viewContactGivenPhone(long phoneNumber) -  This method should return the contact details which has the phoneNumber given as parameter.
public boolean removeContact(long phoneNumber) -  This method should remove the contact details which has the phoneNumber given as parameter.  If removed return true.  Else if the phone number is not available return false.
Write a class Main with the main method.  Create the menu as shown in the Sample Input and Output and invoke the corresponding methods as per the choice provided.

Sample Input and Output 1:
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit
Enter your choice: 1
Add a Contact:
Enter the First Name: John
Enter the Last Name: Michael
Enter the Phone No.: 9787878900
Enter the Email: John@gmail.com
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit

Enter your choice: 1
Add a Contact:
First Name: Jhonty
Last Name: Rhodes
Phone No.: 9787888900
Email: Jhonty@gmail.com
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit
Enter your choice: 2
The contacts in the List are:
First Name: John
Last Name: Michael
Phone No.: 9787878900
Email: John@gmail.com
First Name: Jhonty
Last Name: Rhodes
Phone No.: 9787888900
Email: Jhonty@gmail.com
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit
Enter your choice: 3
Enter the Phone number to search contact:9787888900
The contact is:
First Name: Jhonty
Last Name: Rhodes
Phone No.: 9787888900
Email: Jhonty@gmail.com
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit
Enter your choice: 4
Enter the Phone number to remove :9787888900
Do you want to remove the contact (Y/N): Y
The contact is successfully deleted.
Menu
1.Add Contact
2.Display all contacts
3.Search contact by phone 
4.Remove contact
5.Exit
Enter your choice: 5
*/

import java.util.*;
public class PBManipulate
{
	public static void main(String[] args)
	{
	int ch;
	Scanner sc=new Scanner(System.in);
	PhoneBook pb1=new PhoneBook();
	while(true)
	{
		System.out.println("Menu");
		System.out.println("1.Add Contact");
		System.out.println("2.Display all contacts");
		System.out.println("3.Search contact by phone ");
		System.out.println("4.Remove contact");
		System.out.println("5.Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Add a Contact:");
				System.out.println("Enter the First Name:");
				Contact c=new Contact();
				c.setFirstName(sc.next());
				System.out.println("Enter the Last Name:");
				c.setLastName(sc.next());
				System.out.println("Enter the Phone No.:");
				c.setPhoneNumber(sc.nextLong());
				System.out.println("Enter the Email: ");
				c.setEmailId(sc.next());
				pb1.addContact(c);
				break;
			case 2:
				List<Contact> viewAllContacts = pb1.viewAllContacts();
				System.out.println("The contacts in the List are:");
				for(Contact c1:viewAllContacts)
					System.out.println("First Name: "+c1.getFirstName()+"\n"+"Last Name: "+c1.getLastName()+"\n"+"Phone No.:"+c1.getPhoneNumber()+"\n"+"Email:"+c1.getEmailId());
				break;
			case 3:
				System.out.println("Enter the Phone number to search contact:");
				Contact c1 = pb1.viewContactGivenPhone(sc.nextLong());
					System.out.println("First Name: "+c1.getFirstName()+"\n"+"Last Name: "+c1.getLastName()+"\n"+"Phone No.:"+c1.getPhoneNumber()+"\n"+"Email:"+c1.getEmailId());
					break;
			case 4:
				boolean removeContact = pb1.removeContact(sc.nextLong());
				break;
			case 5:
				System.exit(0);
		}
	}
}
}


public class Contact {

	private String firstName;
	private String lastName;
	private long  phoneNumber;
	private String emailId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Contact(String firstName, String lastName, long phoneNumber,
			String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public Contact()
	{
	    
	}
}

import java.util.ArrayList;
import java.util.List;

public class PhoneBook
{
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	public void addContact(Contact contactObj) 
	{
		phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts() 
	{
		return phoneBook;
	}
	public Contact viewContactGivenPhone(long phoneNumber) 
	{
		Contact c1=null;
	
		for(Contact c:phoneBook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
			
				c1=c;
				break;
			}
			
			
		}
		return c1;
	}
	public boolean removeContact(long phoneNumber) 
	{
		for(Contact c:phoneBook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
			    phoneBook.remove(c);
			    return true;
			}
			
			
		}
		return false;
	}
}