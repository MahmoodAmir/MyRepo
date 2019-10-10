package inheritanceAssignment;

public class Employee {
	long employeeId, employeePhone;
	String employeeName, employeeAddress;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	Employee(long Id, String Name, String address, long phone)
	{
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	
	void calculateSalary()
	{
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
		System.out.println("the Salary is : "+salary);
	}
	
	void calculateTransportAllowance()
	{
		double transportAllowance = (10/100*basicSalary);
		System.out.println("transport allowance is : "+transportAllowance);
	}
	
}
