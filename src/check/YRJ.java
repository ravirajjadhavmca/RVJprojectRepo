package check;

interface RVJ
{
	void m1();
	void m2();
}
public class YRJ implements RVJ 
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}


public static void main(String[] args) 
{
	RVJ r=new YRJ();
	r.m1();
	r.m2();
	
	YRJ y=new YRJ();
	y.m1();
	y.m2();
	
}
}

