package hashsetdemo;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
    TreeSet <String> ts=new TreeSet<String>();
    ts.add("B");
    ts.add("A");
    ts.add("C");
    ts.add("D");
    System.out.println(ts);
     
    ts.remove("D");
    System.out.println(ts);
  
	}

}
