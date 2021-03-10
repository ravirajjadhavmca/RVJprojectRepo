package Inheritance;

//Hierarchical Inheritance

class TestihA
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
class TestihB extends TestihA
{
	void m3()
	{
		System.out.println("M3 m3thod");
	}
	void m4()
	{
		System.out.println("M4 method");
	}
}

public class TestihC extends TestihA 
{
	void m5()
	{
		System.out.println("M5 method");
	}
	void m6()
	{ 
		System.out.println("M6 method");
	}

	public static void main(String[] args) 
	{
	   TestihB b=new TestihB();
	   b.m1();
	   b.m2();
	   b.m3();
	   b.m4();
	   
	   TestihC c=new TestihC();
	   c.m1();
	   c.m2();
	   c.m5();
	   c.m6();
	   
	}

}
