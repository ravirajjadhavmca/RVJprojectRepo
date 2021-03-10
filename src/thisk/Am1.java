package thisk;

//4) this: to pass as an argument in the method
public class Am1 
{
	void m(int a)
	{
		System.out.println("m method");
	}
	
	void n()
	{
		System.out.println("N method");
		this.m(10);    //calling by this keyword
		
	}

	public static void main(String[] args) 
	{
		Am1 m1=new Am1();
		m1.n();

	}

}
