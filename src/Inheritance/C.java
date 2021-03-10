package Inheritance;

class A
{
	void m1()
	{
		System.out.println("Parent m1 method");
	}
	void m2()
	{
		System.out.println("Parent m2 method");
	}
}

class B extends A
{
	void m3()
	{
		System.out.println("child m3 method");
	}
	
}
public class C extends B
{
   void m4()
   {
	   System.out.println("Child m4 method");
   }
   
	public static void main(String[] args) 
	{
		
     C c=new C();
     c.m1(); 
     c.m2();
     c.m3();
     c.m4();
	}

}
