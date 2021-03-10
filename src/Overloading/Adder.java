package Overloading;

public class Adder {
 
static int add(int a,int b)   //this is static method
{
	return a+b;
}  
static int add(int a,int b,int c)
{
	return a+b+c;
	}  
	
public static void main(String[] args){  
System.out.println(Adder.add(11,11));   //called static methods using by class name(Adder)
System.out.println(Adder.add(11,11,11));  
}}  