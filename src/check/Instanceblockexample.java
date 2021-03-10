package check;

public class Instanceblockexample {
	
	int Empid;
	{
		Empid=123;          //instance block are used to initialize instance variable during object creation
     System.out.println("instance variable values "+Empid);
	}

	Instanceblockexample()
	{
		System.out.println("this is 0 arg Constructor");
	}
	
	static
	{
		System.out.println("Static block1");
	}
	
	static
	{
		System.out.println("Static block 2");
	}
	
	Instanceblockexample(int a)
	{
		System.out.println("THis is 1 arg constructor");
	}
		{
			System.out.println("instance block 1");
		}	
	
	public static void main(String[] args) {
		new Instanceblockexample();
		new Instanceblockexample(10);

	}

}
