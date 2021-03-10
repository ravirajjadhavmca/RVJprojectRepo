package check;

class CheckP
{
	void x()
	{
		System.out.println("Parent x class");
	}
	void z()
	{
		System.out.println("Parent z class");
	}
}
public class Checko extends CheckP
{
   void x()
   {
	  System.out.println("Child x class"); 
   }
   
   void y()
   {
	   System.out.println("Child y class");
   }
	public static void main(String[] args) 
	{
//		CheckP cp=new CheckP();
//		cp.x();
//		cp.z();
		
		
//		Checko c=new Checko();
//		c.x();                       //by using child reference we can call both parent and  child methods.
//		c.y();
//		c.z();
		
//   CheckP p=new Checko();
//   p.x();
//   p.z();
   //p.y();   //this method get compile time error because y() method is not available in parent class.
		
		
	CheckP p=new Checko();
	Checko c=(Checko)p;       //by using this object we can call all methods. 
	c.x();
	c.z();
	c.y();
	
	//new Checko().x();	

	}

}
