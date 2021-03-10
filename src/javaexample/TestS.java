package javaexample;

public class TestS 
{
    static int a=10;
     static float f=10.5f;
     static String s="Ravi";
     	
	public static void main(String[] args) 
	{
		TestS t=new TestS();
		t.m1();
		System.out.println(t.a);
		System.out.println(f);
	   System.out.println(s);
	}
   void m1()
   {
	   System.out.println(a);
	   System.out.println(f);
	   System.out.println(s);
   }
	
}
