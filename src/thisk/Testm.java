package thisk;

//2) this: to invoke current class method
public class Testm 
{
	void m()
	{
		System.out.println("M method");
	}
	
	void n()
	{
		System.out.println("N method");
		this.m();    //using by this keyword
	}
	
	public static void main(String[] args) 
	{
		Testm m=new Testm();
		m.n();


	}

}
