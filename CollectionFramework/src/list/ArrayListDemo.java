package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList-
		//dynamic array , expand and shrink autom.
		//duplicate, null allowed
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add("Rahul");
		a1.add("Rahul"); //duplicate allowed
		System.out.println(a1); //preserves insertion order
		
		ArrayList a2 = new ArrayList();
		a2.add(48);
		a2.add(32 );
		a2.add(a1); //Adding collection object as array inside array
		System.out.println(a2);
		
		ArrayList a3 = new ArrayList();
		a3.add(48);
		a3.add(32 );
		a3.addAll(a1);//Adding collection in current array
		System.out.println(a3);
		
		a2.add(1,23); //Adding 23 at 1 index
		System.out.println(a2);
		
		System.out.println(a1.getClass().getName());
		
		//iterating a3 elements
		System.out.println(a3);
		//using for loop:
		for(int i=0; i<a3.size();i++) {
			System.out.println(a3.get(i));
		}
		System.out.println();
		//using for each:
//		for(Integer x : a3) {
//			System.out.println(x);
//		}
		
		//Disadvantage-
		//when we insert or remove an element at the start or middle, 
		//it causes shifting of elements,
		//which is costly in terms of performance. 
		//In such cases, LinkedList is preferred.”
		
		//so,
		//Use ArrayList when → you need fast random access and
		//most operations are read-heavy.
		
//******************************************************************************************
		
		//ArrayList and Iterator by abdulBari
		
		ArrayList<Integer> al1 = new ArrayList<>(20);//Arraylist with generic and size
		ArrayList<Integer> al2 = new ArrayList<>(List.of(30,40,50,30)); //List.of-> static method
		al1.add(10);
		al1.add(0,5);
		al1.addAll(1,al2);
		System.out.println(al1);
		System.out.println(al1.contains(50)); //true coz it present
		System.out.println(al1.contains(25));//false not present
		System.out.println(al1.get(3));//help in finding element in given index
		System.out.println(al1.indexOf(30));//gives element index
		System.out.println(al1.lastIndexOf(30));//gives index of element searching from last
		al1.set(4,90); //change element at given index
		System.out.println(al1);
		
		
		//Accessing methods of Collection elements
		//1. Using For Loop
		System.out.println("Using for");
		for(int i =0; i<al1.size();i++) {
			System.out.println(al1.get(i));//al1[1] can't use like this- coz not array its an generic object 
		}
		
		System.out.println();
		System.out.println("Using For each");
		//2.For Each - getting integer
		for(Integer x:al1) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Using Iterator");
		//3.using iterator - allows forward directional access
		Iterator<Integer> it = al1.iterator();
		while(it.hasNext()) { //checks has next or not return boolean
			System.out.println(it.next()); //prints next element if available
		}
		
		System.out.println();
		System.out.println("Using listIterator in for loop");
		//3.using ListIterator in for loop
		for(ListIterator<Integer> lit = al1.listIterator();lit.hasNext();) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		System.out.println("Using Spliterator");
		//3.using SplIterator in for loop
		Spliterator<Integer> sp = al1.spliterator();
		System.out.println("Using tryAdvance:");
		while (sp.tryAdvance(x -> System.out.println(x)));
		System.out.println("Using forEachRemaining:");
		al1.spliterator().forEachRemaining(System.out::println);
		
		System.out.println();
		System.out.println("Using for each in lambda exp");
		//3.using forEach in lambda expression
		al1.forEach(x-> System.out.println(x));
		//or
		al1.forEach(System.out::println);//scope resolution(::)- System.out is a reference and we giving println() as a method so actually becomes expression so forEach loop will utilize this println of System.out

		System.out.println("Printing using condition");
		al1.forEach(n->show(n));
	}
	
	//outside main method
	static void show(int n) {
		if(n>60) {
			System.out.println(n);
		}
	}

}
