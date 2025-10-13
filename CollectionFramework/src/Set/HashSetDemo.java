package Set;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//By default Initial capacity -> 16 //loadFactor -> 0.75
		HashSet<Integer> hs = new HashSet<>();//can pass new HashSet<>(20,0.50f) initialCapacity and loading factor
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);//Not included(Only Unique Items)
		System.out.println(hs);//unordered form
		hs.forEach(System.out::println);
		
		//increases capacity automatically after 12 entries

	}
}
