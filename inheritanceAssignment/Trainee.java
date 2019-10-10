package inheritanceAssignment;

public class Trainee extends Employee {

	Trainee(long Id, String Name, String address, long phone, double salary) {
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
		double transportAllowance = (10*basicSalary/100);
		System.out.println("transport allowance is : "+transportAllowance);
	}
}
