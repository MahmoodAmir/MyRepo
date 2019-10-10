package org.cap.app;

public class Manager extends Employee
{
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, salary);
		
		this.basicSalary=basicSalary;
	}

			 void calculateTransportAllowance()
		{
			double transportAllowance = 15*basicSalary /100;
			System.out.println("salary after calculating transportAllowance for Manager:"+transportAllowance);
		}
	}
	

