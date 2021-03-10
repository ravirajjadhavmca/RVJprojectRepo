package superkeywordexamples;


//The Super keyword can be used to invoke parent class constructor.
class Animal2
{
	Animal2()
	{
		System.out.println("Animal is created");
	}
}
public class Dogc extends Animal2
{
	Dogc()
	{
		super();
		System.out.println("Dog is created");
	}

	public static void main(String[] args) 
	{
		Dogc d3=new Dogc();

	}

}
