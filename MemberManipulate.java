/*
Member Manipulation
Like the book details the district library wants to store the details about their members.So that it is easy to provide login credentials for those members to access books online. The application should be a menu driven. Develop an application to implement the scenario. 
You are provided with  a class Member with the following private attributes:
int memberId
String memberName
String address
Necessary public getter and setter methods are provided.
A  no argument constructor and a 3 arguments constructor ( memberId, memberName and address) are also provided.
Create a class Library which has an  ArrayList of member as attribute as : 
List<Member> memberList = new ArrayList<Member>().  
Write the getter and setter.
 Also Library class should have the following methods :
 public void addMember(Member memberObj)  -  This method should add the memberObj to the memberList.
 public List<Member> viewAllMembers()  -  This method should return the memberList.
 public List<Member> viewMembersByAddress(String address)  -  This method should return the list of members who belong to that address.
Create a class Main which has the main method.  In the main function write the code to create the menu and invoke the needed functions based on the choice provided.
Design the UI as shown in the samples below.
Sample Input and Output 1:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
123
Enter the name:
sudha
Enter the address:
coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
124
Enter the name:
kavin
Enter the address:
chennai
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
124
Enter the name:
vivek
Enter the address:
coimbatore
1.Add
2.Display
3.Search by address
4.Exit
Enter your choice:
2
Id:123
Name:sudha
Address:coimbatore
Id:124
Name:kavin
Address:chennai
Id:124
Name:vivek
Address:coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
3
Enter the address:
coimbatore
Id:123
Name:sudha
Address:coimbatore
Id:124
Name:vivek
Address:coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4

Sample Input and Output 2:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
123
Enter the name:
sudha
Enter the address:
coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
3
Enter the address:
chennai
None of the member is from chennai
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4

Sample Input and Output 3:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
2
The list is empty
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4
*/

public class Member
{
    private int memberId;
    private String memberName;
    private String address;
    
    public Member()
    {
        
    }
    public Member(int id,String name,String add)
    {
        memberId=id;
        memberName=name;
        address=add;
    }
    public void setMemberId(int id)
    {
        memberId=id;
    }
     public void setMemberName(String name)
    {
        memberName=name;
    }
     public void setAddress(String add)
    {
        address=add;
    }
    public int getMemberId()
    {
        return memberId;
    }
    public String getMemberName()
    {
        return memberName;
    }
    public String getAddress()
    {
        return address;
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class Library
{
	private List<Member> memberList = new ArrayList<Member>();

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	public void addMember(Member memberObj)
	{
		memberList.add(memberObj);
	}
	public List<Member> viewAllMembers()
	{
		return memberList;
	}
	public List<Member> viewMembersByAddress(String address)
	{
		List<Member> m1=new ArrayList<Member>();
		for(Member m:memberList)
		{
			if(m.getAddress().equals(address))
				m1.add(m);
		}
		return m1;
	}
}

import java.util.*;
public class MemberManipulate
{
	public static void main(String[] args)
	{
		Library l=new Library();
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add Member");
		System.out.println("2.View All Members");
		System.out.println("3.Search Member by address");
		System.out.println("4.Exit");
		do
		{
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter your choice:");
					Member m1=new Member();
					System.out.println("Enter the id:");
					m1.setMemberId(sc.nextInt());
					System.out.println("Enter the name:");
					m1.setMemberName(sc.next());
					System.out.println("Enter the address:");
					m1.setAddress(sc.next());
					l.addMember(m1);
					break;
				case 2:
					List<Member> memberList = l.getMemberList();
					for(Member m:memberList)
					     System.out.println("Id:"+m.getMemberId()+"\n"+"Name:"+m.getMemberName()+"\n"+"Address:"+m.getAddress());
					break;
				case 3:
					List<Member> viewMembersByAddress = l.viewMembersByAddress(sc.next());
					for(Member m2:viewMembersByAddress)
						 System.out.println("Id:"+m2.getMemberId()+"\n"+"Name:"+m2.getMemberName()+"\n"+"Address:"+m2.getAddress());
					break;
				case 4:
					System.exit(0);
					
				
			}
			
			
		}while(true);
	}
}