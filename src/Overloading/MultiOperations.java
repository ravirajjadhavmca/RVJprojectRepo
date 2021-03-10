package Overloading;

public class MultiOperations 
{
	public int marks(int sub1,int sub2,int sub3)
	{
		return sub1+sub2+sub3;
	}
	public int marks(int sub1,int sub2)
	{
		return sub1*sub2;
	}
	public int marks(int sub1,int sub2,int sub3,int sub4)
	{
		return (sub1+sub2+sub3+sub4)/2;
	}

	public static void main(String[] args) 
	{
		MultiOperations m=new MultiOperations();
		System.out.println(m.marks(2,2,2));
		System.out.println(m.marks(2,2));
		System.out.println(m.marks(2,2,2,4));
	
	}

}
