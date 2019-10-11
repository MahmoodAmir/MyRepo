package details;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactApp {
	
	public static void main(String args[]) {
		        int choice = 0;
		        Scanner sc = new Scanner(System.in);
		        Map<String, Long> map = new HashMap<String, Long>();
		        while (choice != 4) {
		            System.out.println("Enter your choice:  1- Add\t 2- DisplayAll\t 3- Delete\t 4- Exit");
		            choice = sc.nextInt();
		            switch (choice) 
		            {
		                case 1:
		                	System.out.println("Going to add data ");
		                	System.out.println("Enter number of data to be entered : ");
		                	int number = sc.nextInt();
		                	for(int i=1;i<=number;i++)
		                	{
		                		System.out.println("Enter your name " +i+" : ");
		                		String name = sc.next();
		                		System.out.println("Enter your phone no. " +i+" : ");
		                		Long phoneno = sc.nextLong();
		                		map.put(name, phoneno);		           
		                	}		              	
		                    break;
		                    
		                case 2:
		                	System.out.println("Going to display data ");
		                	System.out.println("data" +map);
		                    break;
		                    
		                case 3:
		                	System.out.println("Enter name to remove ");
		                	String name = sc.next();
		                	map.remove(name);
		                	System.out.println("data remover for "+name);
		                    break;
		                case 4:
		                	System.out.println("System exit");
		                	break;
		                case 5:
		                	System.err.println("Sorry !!! Invalid Choice. Please Input VAlid Choice ");
		                    break;
		            }
		        }
		        sc.close();
	}
}
