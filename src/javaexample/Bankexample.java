package javaexample;

import javax.jws.soap.SOAPBinding;

public class Bankexample
{
    public static int rate_sbi()
    {
      return 45;
    }

    public static int rate_icici()
    {
    return 55;
    }

   public static String bank_name()
   {
	   return "Ratnakar bank";
   }
   public void bname(String a,String b)
   {
	  // String a="Ravi";
	  // String b="Piyu";
	  
	  System.out.println(a);	
	  System.out.println(b); 
	  
   }

  public static void main(String[] args)
  {
	 Bankexample b=new Bankexample();
	 b.bname("Ravi","Priyanka");
	  
	  System.out.println("Value of SBI:-  "    +     Bankexample.rate_sbi());
	  System.out.println("Value of ICICI:-  "     +    Bankexample.rate_icici());
	  System.out.println("Bank of Name:-  "    +    Bankexample.bank_name());
      //System.out.println("Customer Names:- " + Bankexample.bname());
  }
  
}

