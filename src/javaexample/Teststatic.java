package javaexample;

public class Teststatic 
{
	void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) 
	{
		 
		Teststatic t=new Teststatic();
		t.m1();
		
		
		m2();  //direct access
	    Teststatic.m2(); //using by classname
	    t.m2(); //using by object
	   
	}

}
