package list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//linkedList -> provides additional methods addFirst(), addLast(),
		//offer, peek, and poll
		
		LinkedList l1 = new LinkedList();//creating
		l1.add(12);
		l1.add(14);
		l1.add(15);
		System.out.println(l1);
		
		l1.add(2, "Rahul");//adding value at 2nd index
		System.out.println(l1);
		
		System.out.println();
	
		LinkedList l2 = new LinkedList();
		
		//add() → Throws exception if it fails to insert.
		l2.add(96);
		l2.add("dev");
		System.out.println(l2);
		
		l2.addFirst("addedFirst");//will add this at 0 index
		System.out.println(l2);
		
		l2.addLast("addedLast");//add this at last index
		System.out.println(l2);
		
		System.out.println();
		
		l2.addAll(l1);
		System.out.println(l2);
		
		System.out.println(l2.peek());//Returns head element without removing.
		System.out.println(l2);
		
		System.out.println(l2.poll());//Returns head element and removes it.
		System.out.println(l2);
		
		l2.offer("Hello");
		//offer() -> Returns false if it fails, no exception.
		l2.offer(l1);
		System.out.println(l2);
		
		//disadvantage- trade-off is that LinkedList consumes more memory
		//due to node references and is slower for random access, 
		//as it requires traversal from the head or tail.”
	}
}
