package Mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
   HashMap<Integer,String>map=new HashMap<Integer,String>();
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes"); 
   map.put(1, "Mango");   /// hashmap have only unquie key and multiple duplicate values
 map.put(null,"null");
 map.put(null,"null");   //hashmap have only one null key and multiple null values
       
   System.out.println("Iterating Hashmap...");  
  for(Map.Entry m : map.entrySet()){    //entryset method return one Entryclass
	  
	  //System.out.println(m.getKey()+" "+m.getValue());   
	  
	  System.out.println(m.getKey());
	  System.out.println(m.getValue());
  }
   }  


		
	}


