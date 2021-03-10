package Mapdemo;

import java.util.Hashtable;

public class HashTableconcpet {

	public static void main(String[] args) {

		Hashtable h1=new Hashtable();
		h1.put("A", "Priya");
		h1.put("B", "Ravi");
		System.out.println("The hashcode value of h1 is " +h1.hashCode());
		
		
		Hashtable h2=new Hashtable();
		h2.put("C", "riya");
		h2.put("D", "Piya");
		System.out.println("The hashcode value of h2 is " +h2.hashCode());
		
	}

}
