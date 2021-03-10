package interfaces;

interface R1
{
	void m1();
}
interface R2
{
	void m2();
}

class TestN
{
	void m3()
	{
		System.out.println("m3 method");
	}
}

public class TestI1 extends TestN implements R1,R2 
{
      public void m1()
     {
    	 System.out.println("m1 method");
     }
     
      public void m2()
     {
    	 System.out.println("m2 method");
     }
     
	public static void main(String[] args) 
	{
		TestI1 t1=new TestI1();
		t1.m1();
		t1.m2();
		t1.m3();
	}

}