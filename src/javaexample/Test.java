package javaexample;

public class Test 
{
	int a=10;
	int b=20;
	
	
  public static void main(String[] args) 
  {
	 Test t=new Test();
	 t.m1();
	 t.m2();

	System.out.println(t.a);
    System.out.println(t.b);
	}
  void m1()
  {
	  System.out.println(a);
	  System.out.println(b);
  }
  void m2()
  {
	  System.out.println(a);
	  System.out.println(b);
  }
 
}
	