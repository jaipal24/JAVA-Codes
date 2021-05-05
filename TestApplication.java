/*
Inner Class
Address Book
Create an AddressBook class with the attributes
private long phoneNumber
private Address tempAddress
private Address permAddress
Include appropriate getter and setter methods for the above attributes.
 Create an Address class with the private attributes
String name, street, city, state.
Include appropriate getter and setter methods for the above attributes.
The Address class must be available only to AddressBook class. So the Address class should come as a Inner classs in AddessBook class.
Test the application by creating AddressBook object and print permanent ,temporary address and phone number in the main method.

Sample Input 
Enter the permanent address
Enter the house name
Maya Illam
Enter the street
1st street
Enter the city
chennai
Enter the state
tamilnadu
Enter the temporary address
Enter the house name
May flower
Enter the street
2nd street
Enter the city
coimbatore
Enter the state
tamilnadu
Enter the phone number
9874561230

Sample output
Permanent address
House name:Maya Illam
Street:1st street
City:chennai
State:tamilnadu
Temporary address
House name:May flower
Street:2nd street
City:coimbatore
State:tamilnadu
Phone number
9874561230
*/

class AddressBook{
         private long phoneNumber;
         private Address tempAddress;
         private Address permAddress;
         public long getPhoneNumber()
         {
             return this.phoneNumber;
         }
         public void setPhoneNumber(long phno)
        {
           this.phoneNumber=phno;
        }
        public void setTempAddress(Address a1)
        {
            this.tempAddress=a1;
        }
        public void setPermAddress(Address a2)
        {
            this.permAddress=a2;
        }
        public Address getPermAddress()
        {
            return this.permAddress;
        }
       public Address getTempAddress()
        {
           return this.tempAddress;
        }
        
       class Address{
            private String name;
            private String street;
            private String city;
            private String state;
            public String getName()
            {
                return this.name;
            }
            public String getCity()
            {
                return this.city;
            }
          public String getState()
            {
              return this.state;
           }
            public String getStreet()
            {
               return this.street;
            }
            public void setName(String name)
            {
                this.name=name;
            }
            public void setCity(String city)
            {
                this.city=city;
            }
            public void setState(String state)
            {
                this.state=state;
            }
            public void setStreet(String street)
            {
                this.street=street;
            }
       }
        
    }
	
import java.util.*;
  class TestApplication {
 
 	public static void main(String[] args) {
 	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Enter the permanent address");
 	    System.out.println("Enter the house name");
 	    String s1=sc.nextLine();
 	    AddressBook.Address a1=new AddressBook().new Address();
	    AddressBook.Address a2=new AddressBook().new Address();
 	    a1.setName(s1);
 	    System.out.println("Enter the street");
 	    a1.setStreet(sc.nextLine());
 	    System.out.println("Enter the city");
 	    a1.setCity(sc.nextLine()); 	    System.out.println("Enter the state");
 	    a1.setState(sc.nextLine());
 	    System.out.println("Enter the temporary address"); 	    System.out.println("Enter the house name");
 	    a2.setName(sc.nextLine());
 	    System.out.println("Enter the street");
 	    a2.setStreet(sc.nextLine());
 	    System.out.println("Enter the city");
 	    a2.setCity(sc.nextLine());
 	    System.out.println("Enter the state");
 	    a2.setState(sc.next());
 	    System.out.println("Enter the phone number");
 	    AddressBook a11=new AddressBook();
 	    a11.setPhoneNumber(sc.nextLong());
 	    a11.setPermAddress(a1);
 	    a11.setTempAddress(a2); 	    AddressBook.Address ab=a11.getPermAddress();
 	    System.out.println("Permanent address");
 	    System.out.println("House name:"+ab.getName());
 	    System.out.println("Street:"+ab.getStreet());
 	    System.out.println("City:"+ab.getCity());
 	    System.out.println("State:"+ab.getState());
 	    ab=a11.getTempAddress();
 	    System.out.println("Temporary address");
 	    System.out.println("House name:"+ab.getName());
 	    System.out.println("Street:"+ab.getStreet());
 	    System.out.println("City:"+ab.getCity());
 	    System.out.println("State:"+ab.getState());
 	    System.out.println("Phone number");
 	    System.out.println(a11.getPhoneNumber());
 	    
 	    
 	    
 	    
 	}
 }