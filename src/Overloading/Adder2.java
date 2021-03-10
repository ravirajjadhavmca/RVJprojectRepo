package Overloading;

public class Adder2 {
	
     int add(int a, int b)
    {
    	return a+b;
    	}  
    static double add(double a, double b)
    {
    	return a+b;
    	}  
    
    public static void main(String[] args)
    {
    	Adder2 a=new Adder2();
    	System.out.println(a.add(15,15)); //called nonstatic method uscrearioning object 
    
        System.out.println(Adder2.add(12.3,12.6));  
    } 
    }

