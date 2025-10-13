package Set;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		//uses treeMap to store elements
		TreeSet<Integer> ts = new TreeSet<>(List.of(100,50,150,25,125,175));
		System.out.println(ts);//traversal uses Inorder-Traversal and utilize red-black tree
		
		System.out.println(ts.ceiling(50));//if element found then return same element
		System.out.println(ts.ceiling(55));//else return nearest-Highest element(100)
		System.out.println(ts.higher(50));//always return higher
		
		System.out.println(ts.floor(50));//if element found then return same element
		System.out.println(ts.floor(45));//else return nearest-Lowest element(25)
		System.out.println(ts.lower(50));//always return lower
		
		System.out.println(ts.subSet(50, 150));//goes from specific element to desired element - 1
		System.out.println(ts.subSet(50,  true , 175, true));//goes from specific element to desired element
		
		System.out.println(ts.headSet(100));//return its previous all elements
		System.out.println(ts.tailSet(100));//returns its next all elements
		
		System.out.println(ts.descendingSet());//returns ts all elements in descending form
	}
}
