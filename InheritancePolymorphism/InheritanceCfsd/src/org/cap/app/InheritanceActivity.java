package org.cap.app;

public class InheritanceActivity 
{
	public static void main(String[] args)
	{
		Manager manager=new Manager(126534, "Peter","Chennai India",237844, 65000);
		manager.calculateSalary();
		System.out.println(manager);
		manager.calculateTransportAllowance();
		
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		trainee.calculateSalary();
		System.out.println(trainee);
		
	}

}
