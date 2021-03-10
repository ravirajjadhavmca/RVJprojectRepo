package superkeywordexamples;

//The Super keyword can be used to invoke parent class variable
class Animal
{
	String color="White";
}
public class Dogv extends Animal 
{
	String color="Black";
  void printcolor()
  {
	  System.out.println(color);
	  System.out.println(super.color);
  }

	public static void main(String[] args) 
	{
	  Dogv d= new Dogv();
	  d.printcolor();

	}

	}
