package javaexample;

public class Testl   //
{
	void m1()
	{
		int a=10;
	System.out.println(a);
	}
	
	static void m2()
   {
	  int b=20;
	  System.out.println(b);
	  //System.out.println(a);
   }
	void login(){
		System.out.println("its login method");
	}
	public static void main(String[] args) 
	{
      Testl t=new Testl();
      t.m1();
      t.login();
      //t.m1();
      Testl.m2();
      //m2();
     // t.m2();

	}

}
