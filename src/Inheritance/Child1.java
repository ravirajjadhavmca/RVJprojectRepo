package Inheritance;

class Parent
{
	void m1()
	{
		System.out.println("Parent m1 method");
	}
	
	void m2()
	{
		System.out.println("Parent m2 method");
	}
}


public class Child1 extends Parent
{
    void m1()
    {
    	System.out.println("Child m1 method");
    }
    
    void m3()
    {
    	System.out.println("Child m3 method");
    }
	public static void main(String[] args) 
	{
        	Parent p=new Parent();  //If i created parent class object using parent class reference then only my parent class methods executed
        	p.m1();                 //e.g:- if my m1 method is overridden in child class in this case my priority goes to parent class.
        	p.m2();
       
        	
       // Child1 c=new Child1();   //If i created child class object using child class reference then my child class methods executed.
        //	c.m1();
       // c.m3();
       // c.m2();
        	
       // Parent p1=new Child1();   //if i created child class object using by parent class reference. and i have called m1 and m2 method . parent class  
                                  //  m1 method is not executed because m1 method is a overridden from parent class.in this case this m1 method priority goes to 
                                  // the child class. and 
          // p1.m1();
          // p1.m2();
         
           
        	
        	
        	
        	
        
        
        	

	}

}
