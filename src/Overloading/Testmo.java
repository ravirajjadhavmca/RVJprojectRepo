package Overloading;

//Method Overloading

public class Testmo 
{
   void m1(int a)
   {
	   System.out.println("1 argument method overloading");
   }
   
   void m1(int a,int b)
   {
	   System.out.println("2 arguments method overloading");
   }
   
   void m1(char a)
   {
	   System.out.println("charactor method overloading");
   }
   
	public static void main(String[] args) 
	{
		Testmo m=new Testmo();
	    m.m1(10);
	    m.m1(100,200);
	    m.m1('C');
	    
	}

}
