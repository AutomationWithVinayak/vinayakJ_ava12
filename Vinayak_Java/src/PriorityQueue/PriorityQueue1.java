package PriorityQueue;

import java.util.PriorityQueue;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue pq =new PriorityQueue();
		
		pq.add("A");
		pq.add("C");
		pq.add("B");
		pq.add("D");
		pq.add("1");
		//pq.add(1);
		
		
		System.out.println(pq);
		//System.out.println(pq.offer(100));
		
		// get head element ---element --peack--
		
      System.out.println(pq.element()); // -- if the queue is empty it show it will throw  no such element found excepation 
      System.out.println(pq.peek());  // -- if queue is empty it will show NUll 
      
      //remove 
      System.out.println(pq.remove());
      System.out.println(pq.poll());
      System.out.println(pq);
      
      for(Object a:pq) {
    	  System.out.println(a);
      }
	
		
		
	}
}
