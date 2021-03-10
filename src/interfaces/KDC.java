 package interfaces;

interface Bank
{
	float rateOfInterest();
}

class Warana implements Bank
{
	public float rateOfInterest()
	{
		return 6.5f;
		//System.out.println("Overide method");
	}
}

public class KDC extends Warana 
{
	public float rateOfInterest()
	{
		return 9.5f;
	}


	public static void main(String[] args) 
	{
		KDC k=new KDC();
		System.out.println("Rate of KDC bank: " +k.rateOfInterest()+"%");
        
		Warana w=new Warana();
		System.out.println("Rate of Warana Bank: " +w.rateOfInterest()+"%");
		
		//KDC kw=new Warana();
		//System.out.println("Rate of Banks k:" +kw.rateOfInterest());
	}

}
	