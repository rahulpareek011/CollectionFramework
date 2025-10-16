package map;
import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		System.out.println("Default LikedHashMap: ");
		
		//No index -> only key value
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);//normally using LHM
		lhm.put(0, "A");
		lhm.put(1, "B");
		lhm.put(2, "C");
		lhm.put(3, "D");
		lhm.put(4, "E");
		lhm.put(6, "F");
		//All in inserted key manner byDefault
		System.out.println(lhm);//limit exceeds-> increase size
		lhm.forEach((k,v)-> System.out.println(k+ " " +v));
		
		System.out.println();
		System.out.println("LinkedHashMap with constructor(access order):");
		LinkedHashMap<Integer,String> lhm1 = new LinkedHashMap<>(6,.50f,true);//initial capacity,loading factor,accessing order
		lhm1.put(0, "A");
		lhm1.put(1, "B");
		lhm1.put(2, "C");
		lhm1.put(3, "D");
		lhm1.put(4, "E");
		lhm1.put(6, "F");
		//before getting insertion order
		System.out.println(lhm1);
		System.out.println(lhm1.get(2));
		//System.out.println(lhm1.get(5));//Key doesn't exist -> NULL
		System.out.println(lhm1.get(6));
		//after getting insertion order
		lhm1.put(7, "G");//putting element is == accessing element
		System.out.println(lhm1);//same but lets -> make lhm1 -> true in constructor(accessOrder)
		//o/p-> 0,1,3,4,2,6,7 -> first least accessed then at last recently accessed
		//but still limit exceeds automatically
		
		
		//but lets perform cache memory example
		//size will be fixed -> limit exceed -> least accessed deleted
		//we have to override method -> removeEldestEntry();
		System.out.println();
		System.out.println("LinkedHashMap with overriden removeEldestEntry()");
		LinkedHashMap<Integer,String> lhm2 = new LinkedHashMap<>(5,.75f,true) {
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
		
		lhm2.put(0, "A"); // now 0 is removed(least accessed)
		lhm2.put(1, "B");
		lhm2.put(2, "C");
		lhm2.put(3, "D");
		lhm2.put(4, "E");
		lhm2.put(6, "F");
		System.out.println(lhm2);
		
		
		
		
		

	}
}
