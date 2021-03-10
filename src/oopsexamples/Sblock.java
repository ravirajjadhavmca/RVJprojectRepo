package oopsexamples;

public class Sblock 
{
	{
		System.out.println("Instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	static
	{
		System.out.println("Static block 1");
	}
	static
	{
		System.out.println("Static block 2");
	}
  
	Sblock()
	{
		System.out.println("0 argument constructor");
	}
	Sblock(int a)
	{
		System.out.println("1 argument constructor");
	}
	public static void main(String[] args) 
	{
         new Sblock();
         new Sblock(10);
	}

}
