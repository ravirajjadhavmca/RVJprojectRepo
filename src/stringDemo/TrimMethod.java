package stringDemo;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the city Name:- ");
		   String name = sc.nextLine().toLowerCase().trim();    //trim() method is used for remove all first and last spaces.       
		   
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
