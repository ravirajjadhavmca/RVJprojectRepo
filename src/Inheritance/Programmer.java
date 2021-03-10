package Inheritance;

class Employee{
	int salary=20000;
}
class Tester extends Employee
{
	int salary1=30000;	
}

public class Programmer extends Tester{
 int bonus=1000; 
	public static void main(String[] args) {
		Programmer pro=new Programmer();
		 System.out.println("salary of programmer is "+pro.salary);
		 System.out.println("bonus of employee is"+pro.bonus);
		

	}

}
