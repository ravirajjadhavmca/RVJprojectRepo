package Abstraction;

abstract class Test1
{
	Test1()
	{
		System.out.println("Parent constructor");
	}
	
	abstract void m1();
	static
	{
		System.out.println("static block");
	}
	void m2()
	{
		System.out.println("Parent new method");
	}
	
}
public class Test extends Test1 
{
 Test()
    {
    	System.out.println("child constructor");
   }
  
void m1()
    {
    	System.out.println("abstract m1 method");
    }

	public static void main(String[] args) 
	{
         Test1 t=new Test();
         t.m1();
         t.m2();
	}

}
