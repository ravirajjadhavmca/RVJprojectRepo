package javaexample;

public class Teststatic1 
{
    void m1()
    {
    	System.out.println("Raviraj");
    }
    void m2()
    {
    	System.out.println("Vishnu");
    }
    static void m3()
    {
    	System.out.println("Jadhav");
    }
    static void m4()
    {
    	System.out.println("Priyanka");
    }
	public static void main(String[] args) 
	{
		Teststatic1 t=new Teststatic1();
		t.m1();//using by object
		t.m2();//using by object
		m3();// direct access
		m4();//direct access
		Teststatic1.m4();//using by class name
	}

}
