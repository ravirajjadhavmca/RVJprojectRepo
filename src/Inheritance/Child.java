package Inheritance;

 class Test 
{
   void IT()
   {
	   System.out.println("IT department data");
   }
   void HR()
   {
	   System.out.println("HR department parent data");
   }}
   
   public class Child extends Test
   {
	  void HR()
	  {
		  System.out.println("HR department of child data");
	  }
	public static void main(String[] args) 
	{
	    //Test t=new Test();
	    //t.IT();
	   // t.HR();
	    
      Child c=new Child();
      c.IT();
      c.HR();
      
	}  
	}
