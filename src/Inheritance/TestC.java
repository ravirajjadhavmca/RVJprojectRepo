package Inheritance;

//Multilevel Inheritance

class TestA
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
class TestB extends TestA
{
	void m3()
	{
		System.out.println("M3 method");
	}
	void m4()
	{
		System.out.println("M4 method");
	}
}
public class TestC extends TestB  
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
	   
		TestA a=new TestA();
		a.m1();
		a.m2();
		
	   new TestB().m1();
	   new TestB().m2();
	   new TestB().m3();
	   new TestB().m4();
	   
	   
	   TestC c=new TestC();
	   c.m1();
	   c.m2();
	   c.m3();
	   c.m4();
	   c.m5();
	   c.m6();
	}

}
