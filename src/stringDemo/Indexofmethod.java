package stringDemo;

public class Indexofmethod {                 //one argument indexof.

	public static void main(String[] args) 
	{
		String s="abcdefg";
		System.out.println(s.indexOf('g'));  //which index g is available....ans is 6.

		System.out.println(s.indexOf('z'));   //z is not available in index we will get ans.. -1.
		                                      //if the specified character not available then we are going to get -1.
	
		String s1="babbab";
		System.out.println(s1.indexOf('a'));    //if characters are doubles then index will return first number. 
		
	}                                        

}
