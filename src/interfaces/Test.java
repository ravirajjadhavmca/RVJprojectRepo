package interfaces;

interface Printable
{
 void print();
}
interface Showable
{
	void show();

}
class Test implements Printable,Showable
{
	public void print()
	{
		System.out.println("Printing");
	}
	public void show()
	{
		System.out.println("Showing");
	}
	
	public static void main(String[] args)
	{
	    Test t=new Test();
		t.print();
		t.show();
		
	}
}
