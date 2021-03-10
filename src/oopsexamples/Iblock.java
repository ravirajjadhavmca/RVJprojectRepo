package oopsexamples;
//Instance blocks
public class Iblock 
{
    Iblock()
    {
    	System.out.println("0 argument constructor");
    }
    
    Iblock(int a)
    {
    	System.out.println("1 argument constructor");
    }
    
    {
    	System.out.println("instance blocks");
    }
	public static void main(String[] args) 
	{
		new Iblock();
		new Iblock(10);
		new Iblock();
	}
	

}
