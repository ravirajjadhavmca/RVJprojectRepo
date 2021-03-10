package Newcompany;

public class DogT 
{
    String Breed;
    int Age;
    String Color;
    float Height;
    double Weight;
    
    
    void m1()
    {
       Breed= "German Shepat";
       Age= 10;
       Color= "Black";
       Height=2.3f;
      // Weight= 15.5;  
        
       
       System.out.println("Dog Breed= " +Breed);
       System.out.println("Dog Age= "+Age);
       System.out.println("Dog color= "+Color);
       System.out.println("The Height of Dog= " +Height);
     //  System.out.println("The Weight of the Dog= "+Weight);
    }
    void m2(double W)
    {
       Weight = W;
    	System.out.println("Weight ="+W);
    }
	public static void main(String[] args) 
	{
		DogT d=new DogT();
		d.m1();
		
		DogT d1=new DogT();
	    d1.m2(16.5);
	    
	}

}
