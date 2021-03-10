package javaexample;

class X{}
class Emp{}
class Y{}
class Student{}
class Method2
{
    void m1(X x,Emp e)
    {
    	System.out.println("m1 method");
    }
    static void m2(Y y,Student s)
    {
       System.out.println("m2 method");
    }
	public static void main(String[] args) 
	{
	   Method2 m=new Method2();
	   X x = new X();
	   Emp e1=new Emp();
	   m.m1(x,e1);
	 
	   Y y=new Y();
	   Student s=new Student();
	   Method2.m2(y,s);
	   
	}
	}
