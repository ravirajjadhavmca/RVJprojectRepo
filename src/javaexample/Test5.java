package javaexample;

public class Test5 
{
  int a=10;
  static int b=20;
  
	public static void main(String[] args) 
	{
	  Test5 t=new Test5();
	  System.out.println(t.a);
	  System.out.println(t.b);
	  
     t.a=100;
     t.b=200;
     System.out.println(t.a);
     System.out.println(t.b);
     
     Test5 t1=new Test5();
     System.out.println(t1.a);
     System.out.println(t1.b);
    
 	Test5 t2=new Test5();
 	t2.a=1000;
 	t2.b=2000;
 	System.out.println(t2.a);
 	System.out.println(t2.b);
 	
 	Test5 t3=new Test5();
 	System.out.println(t3.a);
 	System.out.println(t3.b);
 	
 //	Testl l=new Testl();
 //	l.login();
 //	l.m1();
 	
	}
     

}

