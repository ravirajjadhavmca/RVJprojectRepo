package collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.util.Iterator;

public class arraylistconcept
{
    
	public static void main(String[] args) 
	{
		int a[]=new int[3];  //static array - size is fixed
		
		// Arraylist is a dynamic array.
		//1. It can contain duplicate values/elements.
		//2. It maintain insertion order.
		//3. It is not synchronized.
		//4. It allows random access to fetch the element because it stores the values on the basis of indexes.
		
		ArrayList<Integer>ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(30); 
		ar.remove(0);
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		ar.add(40);
	
		
	System.out.println(ar.size());
	System.out.println(ar);

	System.out.println(ar.get(4));
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(60);
		ar1.add(70);
		ar.addAll(ar1);
	//	for(int i=0;i<ar.size();i++){
		//	System.out.println(ar.get(i));
			
			Iterator<Integer>it=ar.iterator();
			while(it.hasNext()){
				Integer inte=it.next();
				System.out.println(inte);
			}
			
		}
		
	}

 