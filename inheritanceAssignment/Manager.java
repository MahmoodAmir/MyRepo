package inheritanceAssignment;

public class Manager extends Employee {

	Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}
	
	@Override
	void calculateTransportAllowance()
	{
		double transportAllowance = (15*basicSalary /100);
		System.out.println("transport allowance is : "+transportAllowance);
	}

}
