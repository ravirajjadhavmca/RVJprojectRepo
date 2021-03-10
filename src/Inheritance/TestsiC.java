package Inheritance;

//Single Inheritance

class TestsiA
{
	void m1()
	{
		System.out.println("M1 method");
	}
	
	void m2()
	{
		System.out.println("M2 method");
	}
}
public class TestsiC extends TestsiA 
{
	void m3()
	{
		System.out.println("M3 method");
	}
	
	void m4()
	{
		System.out.println("M4 method");
	}

	public static void main(String[] args) 
	{
		TestsiC c=new TestsiC();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
	}

}
