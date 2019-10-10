package ExceptionHandling;

public class TaxCalculator 
{
	public double calculateTax(String empName,boolean isIndian,double sal) throws taxNotEligibleException 
	{
		double taxAmount = 0;
		if(!isIndian)
		{
			throw new taxNotEligibleException("The employee should be an Indian citizen for calculating tex ");
		}
		else if(empName.isEmpty())
		{
			throw new taxNotEligibleException("The employee name cannot be empty");
		}
		
		else if(sal>100000&&isIndian) 
		{
			taxAmount=(sal*8)/1000;
			System.out.println("Tax amount is"+taxAmount);
		}
		else if(sal>50000&&sal<100000&&isIndian) 
		{
			taxAmount=(sal*6)/1000;
			System.out.println("Tax amount is"+taxAmount);
		}
		else if(sal>30000&&sal<50000&&isIndian) 
		{
			taxAmount=(sal*5)/1000;
			System.out.println("Tax amount is"+taxAmount);
		}
		else if(sal>10000&&sal<30000&&isIndian) 
		{
			taxAmount=(sal*4)/1000;
			System.out.println("Tax amount is"+taxAmount);
		}
		else 
		{
			throw new taxNotEligibleException("The employee does not need to pay tax");
		}
		    return taxAmount;
		}
	
}