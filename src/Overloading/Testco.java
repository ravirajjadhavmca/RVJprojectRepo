package Overloading;

//Constructor Overloading

public class Testco 
{
	Testco(int a)
	{
		System.out.println("1 argument constructor overloading");
	}
	
	Testco(int a,int b)
	{
		System.out.println("2 arguments constructor overloading");
	}
	
	Testco(char ch)
	{
		System.out.println("charactor constructor overloading");
	}

	public static void main(String[] args) 
	{
		new Testco(10);
		new Testco(1000,2000);
		new Testco('C');
	

	}

}
