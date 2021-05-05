/*
Book Manipulation
The district central library needs an application to store book details of their library. The clerk who has all the rights to add a new book,search for any book,display the book details and should update the count of total number of books.
You are provided with a  Book with the following private attributes:
int isbnno
String bookName
String author
Needed getters and setters are written.
Create a class Library with the following private attribute:
ArrayList<Book> bookList = new  ArrayList<Book>();
Also provide the necessary setter and getter methods.  
Include the following public methods:
void addBook(Book bobj) - This method should add the book object to the booklist.
boolean isEmpty() -  This method should return true if the booklist is empty else return false.
ArrayList<Book> viewAllBooks() - This method should return the list of books maintained in the library.
ArrayList<Book> viewBooksByAuthor(String author ) -  This method should return a list of books written by the author passed as argument. When you display an empty list it should print the message "The list is empty".
int countnoofbook(String bname) -  this method should return the count of books with the name passed as argument.
Write a Main class to test the above functionalities.

Sample Input and Output 1:
1.Add Book
2.Display all book details
3.Search Book by author 
4.Count number of books - by book name
5.Exit
Enter your choice:
1
Enter the isbn no:
123
Enter the book name:
Java
Enter the author name:
Bruce Eckel
1.Add Book
2.Display all book details
3.Search Book by author 
4.Count number of books - by book name
5.Exit
Enter your choice:
1
Enter the isbn no:
124
Enter the book name:
C++
Enter the author name:
Eric Nagler
1.Add Book
2.Display all book details
3.Search Book by author 
4.Count number of books - by book name
5.Exit
Enter your choice:
3
Enter the author name:
Henry
None of the book published by the author Henry
1.Add Book
2.Display all book details
3.Search Book by author 
4.Count number of books - by book name
5.Exit
Enter your choice:
3
Enter the author name:
Eric Nagler
ISBN no: 124
Book name: C++
Author name: Eric Nagler
1.Add Book
2.Display all book details
3.Search Book by author 
4.Count number of books - by book name
5.Exit
Enter your choice:
5
*/

import java.util.*;
public class Library 
{
	private ArrayList<Book> bookList = new ArrayList<Book>();
	int count;
	//private static int count;
	
	public ArrayList<Book> getBookList() {
		return this.bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj)
	{
	    this.bookList.add(bobj);
	    
	}
	
	public boolean isEmpty()
	{
	    return this.bookList.isEmpty();
	    
	}
	
	public ArrayList<Book> viewAllBooks()
	{
	    
	    return this.bookList;
	    
	}
	
	public ArrayList<Book> viewBooksByAuthor(String author)
	{
	   ArrayList<Book> b1 = new ArrayList<Book>();
	   if(this.bookList.isEmpty())
	        System.out.println("The list is empty");
	   else{
	   for(Book b : this.bookList)
	   {
	       if(b.getAuthor()== author)
	        b1.add(b);
	   }
	   }
	   return b1;
	}
	
	public int countnoofbook(String bname)
	{
	    count = 0;
	    for(Book b : this.bookList)
	    {
	        if(b.getBookName()==bname)
	        count++;
	    }
	    return count;
	    
	}
	
}
	

public class Book {

	private int isbnno;
	private String bookName;
	private String author;
	
	public int getIsbnno() {
		return isbnno;
	}
	
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

import java.util.*;

public class BookManipulate 
{
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        Library lib = new Library();
        
        int c=0;
        while(c!=5)
        {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            c= in.nextInt();
            
            switch(c)
            {
                case 1:
                    Book b = new Book();
                    System.out.println("Enter the isbn no:");
                    b.setIsbnno(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter the book name:");
                    b.setBookName(in.nextLine());
                    System.out.println("Enter the author name:");
                    b.setAuthor(in.nextLine());
                    lib.addBook(b);
                    break;
                
                case 2:
                    ArrayList<Book> blist = lib.getBookList();
                    for(Book a : blist)
                    {
                        System.out.println("ISBN no: "+a.getIsbnno());
                        System.out.println("Book name: "+a.getBookName());
                        System.out.println("Author name: "+a.getAuthor());
                    }
                    break;
                    
                case 3 :
                    System.out.println("Enter the author name:");
                    String author = in.nextLine();
                    ArrayList<Book> s = lib.viewBooksByAuthor(author);
                    for(Book a : s)
                    {
                        System.out.println("ISBN no: "+a.getIsbnno());
                        System.out.println("Book name: "+a.getBookName());
                        System.out.println("Author name: "+a.getAuthor());
                    }
                    break;
                
                case 4:
                    System.out.println("Enter the book name:");
                    String bookname = in.nextLine();
                    System.out.println("The book count is "+lib.countnoofbook(bookname));
                    break;
                
                default:
                    break;
                    
                    
                    
            }
            
        }
    }
}