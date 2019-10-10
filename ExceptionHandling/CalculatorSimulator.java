package ExceptionHandling;

import java.util.Scanner;

public class CalculatorSimulator 
{
	public static void main(String[] args) throws taxNotEligibleException 
	{
		TaxCalculator tc=new TaxCalculator();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter employee name");
		String empName=scanner.nextLine();
		
		System.out.println("Enter employee salary");
		double sal=scanner.nextInt();
		
		System.out.println("Is employee an Indian,give as true/false");
		boolean isIndian=scanner.nextBoolean();
		
		try 
		{
			tc.calculateTax(empName,isIndian,sal);
			
		}
		catch (Exception e) 
		{
		   System.out.println("Tax Amount is: "+""+tc.calculateTax(empName,isIndian,sal));
		}	
	}

}
