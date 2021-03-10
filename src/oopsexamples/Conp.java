package oopsexamples;
// User defined constructor (Parametarized constructor)
public class Conp 
{
  //  void m1()
    //{
    //	System.out.println("M1 method");
    //}
	
	//Conp()
  //{
	//  System.out.println("zero arguments cons");
  //}
  Conp(int a)
  {
	  System.out.println("1 argument cons");
  }
	
	public static void main(String[] args) 
	{
        //Conp p=new Conp();
        Conp p1=new Conp(10);
        //p.m1();
        //p1.m1();
	}

}

