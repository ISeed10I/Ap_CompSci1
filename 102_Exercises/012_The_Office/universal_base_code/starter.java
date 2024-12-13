/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.raiseSalary(10);
	System.out.println("Dwight Schrute's Salery : "+Dwight.getSalary()+" and Annual salery : " +Dwight.getAnnualSalary());
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		jim.raiseSalary(14);
	System.out.println("Jim Halpert's Salery : "+jim.getSalary()+" and Annual salery : " +jim.getAnnualSalary());
		Employee pam = new Employee(2011,"Pam","Beasly",2250);
		pam.raiseSalary(6);
	System.out.println("Pam Beasly's Salery : "+pam.getSalary()+" and Annual salery : " +pam.getAnnualSalary());
		Employee custom = new Employee(5420,"John","Stewert",3247.69);
		custom.raiseSalary(20);
	System.out.println("John Stwert's Salery : "+custom.getSalary()+" and Annual salery : " +custom.getAnnualSalary());

	}
}
