package oopsexamples;
//instance blocks with variable
public class Iblock1 
{
   int empid;
   {
	   empid=11004388;   //This is a instance block.
   }
   
   void display()
   {
	   System.out.println("Employee ID:- "+empid);
   }
   
 	public static void main(String[] args) 
	{
		new Iblock1().display();
		new Iblock1().display();

	}

}
