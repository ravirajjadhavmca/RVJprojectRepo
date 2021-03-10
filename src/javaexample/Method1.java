package javaexample;

public class Method1 
{
	public void l(int a,char ch)//local variable
	{
		System.out.println("m1 method");
	    System.out.println(a);
	    System.out.println(ch);
	}
	void login(String a,String b){
		
	}
	static void m2(String str,double d)
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
		
	}
	public static void main(String[] args) 
	{
      Method1 m=new Method1();
      m.l(10,'a');
      Method1.m2("Ravi",10.5);
      }

}
