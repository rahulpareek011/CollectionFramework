package Map;
import java.util.*;
import java.util.Map.Entry;//for using entry

public class TreeMapDemo {

	public static void main(String[] args) {
		//Internally uses Red-black tree
		//Order followed on the basis of key
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));//creating key-value pair
		System.out.println(tm);
		
		tm.put(5, "E");
		tm.put(6, "F");
		tm.put(6, "H");//duplicating key modifies value
		tm.put(7, null);//allow null values
		tm.put(7, "H");//allow duplicate values
//		tm.put(null, "H");//doesn't allow null key
		
		System.out.println(tm);
		System.out.println(tm.get(3));//returns value
		System.out.println(tm.ceilingKey(4));//returns either key if present or higher nearest key
		System.out.println(tm.ceilingEntry(4));//returns either key value if present or higher nearest key value pair
		
		System.out.println();
		
		Entry<Integer,String> e = tm.ceilingEntry(3);//storing in its type(Map.Entry<K,V>)
		System.out.println(e);
		//Internally
		System.out.println(e.getKey() + "=" + e.getValue());//Key-Value Pair-> Entry Interface

	}

}
