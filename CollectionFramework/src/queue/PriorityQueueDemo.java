package queue;
import java.util.*;

class OwnCom implements Comparator<Integer>{
	public int compare(Integer o1 , Integer o2) {
		if(o1<o2) return 1;
		if(o1>o2) return -1;
		return 0;
	}
}

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		p1.add(20);
		p1.add(10);
		p1.add(30);
		p1.add(5);
		p1.add(15);
		p1.add(3);
		System.out.println(p1);
		
		System.out.println(p1.peek());//return smallest element(Priority Low -> High)
		p1.poll();
		System.out.println(p1);
		
		System.out.println("********************");
		
		PriorityQueue<Integer> p2 = new PriorityQueue<>(new OwnCom()); // changed priority to High -> Low
		p2.add(20);
		p2.add(10);
		p2.add(30);
		p2.add(5);
		p2.add(15);
		p2.add(3);
		System.out.println(p2);
		
		System.out.println(p2.peek());//return smallest element(Priority Low -> High)
		p2.poll();
		System.out.println(p2);
	}

}
