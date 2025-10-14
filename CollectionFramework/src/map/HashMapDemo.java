package map;
import java.util.*;
import java.util.Map.Entry;//for using entry

public class HashMapDemo {

	public static void main(String[] args) {
		//Internally uses Hashing(array + LinkedList/Tree)
		//Order not followed
		HashMap<Integer,String> hm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));//creating key-value pair
		System.out.println(hm);
		
		hm.put(5, "E");
		hm.put(6, "F");
		hm.put(6, "H");//duplicating key modifies value
		hm.put(7, null);//allow null values
		hm.put(7, "H");//allow duplicate values
		hm.put(null, "H");//allow one null key
		
		System.out.println(hm);
		System.out.println(hm.get(3));//returns value
		//System.out.println(tm.ceilingKey(4));//returns either key if present or higher nearest key
		//System.out.println(tm.ceilingEntry(4));//returns either key value if present or higher nearest key value pair
		
		//Entry<Integer,String> e = tm.ceilingEntry(3);//storing in its type(Map.Entry<K,V>)
		//System.out.println(e);
		//Internally
		//System.out.println(e.getKey() + "=" + e.getValue());//Key-Value Pair-> Entry Interface 
		
		System.out.println();
		System.out.println("Internal working");
		
		//Internal Working of hashMap Step-by-Step (for interview)
		HashMap<String, Double> employees = new HashMap<>();
		employees.put("Vikram", 800.0);
		employees.put("Nabeel", 900.0);
		employees.put("Vikram", 1000.0);
		//step 1:
		//From the entry ("Vikram", 800), extract the key "Vikram".
		
		//step 2:
		//HashMap calls the hashCode() method of the key:
		
		//step 3:
		//Internally, HashMap divides hashcode using the hashing function:
		//hashing function: h(x) = x%10;
		
		//step 4
		//A new entry (Node) object is created:
//		key = "Vikram"
//		value = 800
//		hashcode = 128281
//		next = null
		
		//This node is stored in bucket 1.
		//If bucket 1 was empty → directly stored.
		//If not → it is linked using a LinkedList.
	}

}
