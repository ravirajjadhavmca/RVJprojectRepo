package interfaces;


interface a1
{
     int a=10;
     void m5();
}
interface a2
{
	int a=100;
	void m5();
}
public class Test2 implements a1,a2{
	public void m5() {
		System.out.println("c method");
			
		}
public static void main(String[] args) 
	{
		
		System.out.println("value of a= " + a1.a);
		System.out.println("value of a= " + a2.a);	
		
	    Test2 t2=new Test2();
	    t2.m5();
		
	}

	
}

