package thisk;

//3) this() : to invoke current class constructor
//Calling parameterized constructor from default constructor:
public class Testc1 
{
	Testc1()
	{
		this(10);   //calling by this keyword
		System.out.println("zero argument constructor");
	}
	
	Testc1(int a)
	{
		System.out.println("1 argument constructor");
	}
	
	public static void main(String[] args) 
	{
		Testc1 c1=new Testc1();
	
	}

}
