package Set;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//LHS follows insertion order while HashSet sort it
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("A");
		lhs.add("C");
		lhs.add("E");
		lhs.add("B");
		lhs.add("D");
		lhs.add(null);
		lhs.add(null);//allow one null
		lhs.add("D");//duplicate not allowed
		System.out.println(lhs);
	}

}
