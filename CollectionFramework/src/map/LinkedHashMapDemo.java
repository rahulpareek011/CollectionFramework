package map;
import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
		lhm.put(0, "A");
		lhm.put(1, "B");
		lhm.put(2, "C");
		lhm.put(3, "D");
		lhm.put(4, "E");
		lhm.put(6, "F");
		System.out.println(lhm);//limit exceeds-> increase size
		lhm.forEach((k,v)-> System.out.println(k+ " " +v));
	}
}
