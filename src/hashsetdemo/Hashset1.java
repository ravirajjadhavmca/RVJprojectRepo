package hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ravi");
		hs.add("Nikhil");
		hs.add("Jadhav");
		hs.add("Raviraj");
		hs.add("Jadhav");
		hs.add("null");
		hs.add("null");
//System.out.println(hs);
		
		hs.remove("Nikhil");    //remove element
		
		//adding two more elements
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Piya");
		hs1.add("Priyanka");
		
		hs.addAll(hs1);     //adding all the new elements
    //    hs.removeAll(hs1);     //Removing all the new elements from HashSet

Iterator<String> itr=hs.iterator();
while(itr.hasNext())
{
   System.out.println(itr.next());
}
	}

}
