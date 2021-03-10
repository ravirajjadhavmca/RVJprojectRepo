package interfaces;

interface p1
{
	void m1();
}
interface p2
{
	void m2();
}

public class TestI implements p1,p2
{
	public void m1()                   //overridden method should be public
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) 
	{
	    TestI t=new TestI();
	    t.m1();
	    t.m2();

	}

}
