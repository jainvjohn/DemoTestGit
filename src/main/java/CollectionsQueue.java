import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue pq= new PriorityQueue();
		pq.add("Eris");
		pq.add("Roman");
		pq.add("Ryan");
		pq.add("Sam");
		pq.add("Dev");
		
		Queue pq2 = new PriorityQueue();
		pq2.add(34);
		pq2.add(30);
		pq2.add(78);
		pq2.add(90);
		pq2.add(13);
		
		Queue pq3=new PriorityQueue();
		pq3.add(32.8);
		pq3.add(2.28);
		pq3.add(43.0);
		pq3.add(32.9);
		
		System.out.println(pq);
		System.out.println(pq2);
		System.out.println(pq3);

	System.out.println("\n\n");
	

	System.out.println(	pq2.poll());
	System.out.println(pq2);
	System.out.println(	pq2.poll());
	
System.out.println("\n\n");
	

	System.out.println(	pq3.poll());
	System.out.println(pq3);
	System.out.println(	pq3.poll());
	
System.out.println("\n\n");
	

	System.out.println(pq.peek());
	System.out.println(pq);
	System.out.println(pq.peek());
	}

}
