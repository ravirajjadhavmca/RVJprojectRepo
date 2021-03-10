package Newcompany;

//constructor overloading
public class Testover 
{
    Testover(int a)
    {
    	System.out.println("1 argument constructor");
    }
    
    Testover(int a,int b)
    {
    	System.out.println("2 arguments constructor");
    }
    
    Testover(char ch)
    {
    	System.out.println("character argument constructor");
    }
    
	public static void main(String[] args) 
	{
         new Testover(10);
         new Testover(100,200);
         new Testover('C');
   
	}

}
