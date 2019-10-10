package LibraryProgram;
import java.util.Scanner;

class KidUsers implements libraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int age)
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		
		else if(age>12)
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook(String bookType)
	{

		if(age<12)
		{
			System.out.println("Book Issued successfully, please return the book within 10 day");
		}
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
}

class AdultUser implements libraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int age)
	{
		
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		
		else if(age<12)
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	
	public void requestBook(String bookType)
	{
		if(age<12)
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}
}


class LibraryInterfaceDemo
{
	public static void main(String args[])
	{
		KidUsers ku = new KidUsers();
		AdultUser au = new AdultUser();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the book type");
		String book = sc.next();
		
		if(age<12) 
		{
		ku.registerAccount(age);	
		ku.requestBook(book);
		}
		else 
		{
		au.registerAccount(age);
		au.requestBook(book);
		}
	
	}
}