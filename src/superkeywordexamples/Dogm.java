package superkeywordexamples;

////The Super keyword can be used to invoke parent class method.
class Animal1
{
	void eat()
	{
		System.out.println("eating");
	}
}
public class Dogm extends Animal1
{
	void eat()
	{
		System.out.println("eating bread");
	}
	void bark()
	{
		System.out.println("barking");
	}
	void work()
	{
		super.eat();
		bark();
		
	}

	public static void main(String[] args) 
	{
		Dogm dm=new Dogm();
		dm.work();

	}

}
