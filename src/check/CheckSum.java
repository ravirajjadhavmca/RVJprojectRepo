package check;

public class CheckSum 
{
   void Sum(int a,int b)
   {
	   System.out.println(a+b);
   }
   
   void Sum(int a,int b,int c)
   {
	   System.out.println(a+b+c);
   }
	public static void main(String[] args) 
	{
		CheckSum s=new CheckSum();
		s.Sum(25,25);
		s.Sum(25,25,25);
		
	}

}
