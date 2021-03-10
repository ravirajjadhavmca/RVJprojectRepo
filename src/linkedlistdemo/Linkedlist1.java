package linkedlistdemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) 
	{
	  LinkedList <String> ll=new LinkedList<String>();
	  ll.add("Blue");
	  ll.add("Orange");
	  ll.add("Pink");
	  System.out.println(ll);
	   
	  ll.addFirst("Purple");
	  ll.addLast("Black");
	  
	//Collections.reverse(ll);       //descending order
	System.out.println("after reverse the array list: " +ll);
	
	Collections.sort(ll);     //Ascending order
	System.out.println("sorting: "+ll);
//System.out.println(ll);

//Iterator<String> itr=ll.descendingIterator();
//while(itr.hasNext())
//{
//	System.out.println(itr.next());
//}

//for(int i=0; i<ll.size();i++)
//{
//	System.out.println(ll.get(i));
//}
	}

}
