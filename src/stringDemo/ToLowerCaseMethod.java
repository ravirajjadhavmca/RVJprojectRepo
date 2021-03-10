package stringDemo;

import java.util.Scanner;

public class ToLowerCaseMethod {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the city Name:- ");
		   String name = sc.nextLine().toLowerCase().trim();      //using by toLowerCase method.
		   
		   if(name.equals("kolhapur"))
		   {
			   System.out.println("Welcome to Kolhapur.....");
		   }
		   else if(name.equals("pune"))
		   {
			   System.out.println("Welcome to Pune.....");
		   }
		   else if(name.equals("mumbai"))
		   {
			   System.out.println("Welcome to Mumbai.....");
		   }
		   else
		   {
			   System.out.println("Please enter a valid city name");
		   }
		   
	

	}

}
