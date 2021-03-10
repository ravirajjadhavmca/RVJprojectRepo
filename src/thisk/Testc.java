package thisk;

//3) this() : to invoke current class constructor
//Calling default constructor from parameterized constructor:
public class Testc 
{
   Testc()
   {
	   System.out.println("zero arguments constructor");
   }
   
   Testc(int a)
   {
	   this();
	   System.out.println("1 argument constructor");
   }
   
	public static void main(String[] args) 
	{
	    Testc c=new Testc(10);
	    

	}

}
