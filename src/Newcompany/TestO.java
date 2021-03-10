package Newcompany;

public class TestO 
{
   void m1(String s,float f,String c)
   {
	   System.out.println("The Dog breed name= "+s);
	   System.out.println("The Height of the dog= "+f);
	   System.out.println("The color of the dog= "+c);
   }
	
	public static void main(String[] args) 
	{
		TestO o=new TestO();
		//o.m1("German");
		//o.m1("German", 2.3f);
		o.m1("German",2.3f,"Black");
		
	}

}
