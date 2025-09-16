package list;

import java.util.ArrayList;

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

		
		//Disadvantage-
		//when we insert or remove an element at the start or middle, 
		//it causes shifting of elements,
		//which is costly in terms of performance. 
		//In such cases, LinkedList is preferred.”
		
		//so,
		//Use ArrayList when → you need fast random access and
		//most operations are read-heavy.

	}

}
