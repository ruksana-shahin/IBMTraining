import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> que= new LinkedList<>();
	    //initialize the queue with values
	    que.add("one");
	    que.add("two");
	    que.add("three");
	    que.add("four");
	    //print the Queue
	    System.out.println("The Queue contents:" +que);
	    que.offer("five");
	    System.out.println("The Queue contents:" +que);
	    que.remove("one");
	    System.out.println("The Queue contents:" +que);
	    que.poll();
	    System.out.println("The Queue contents:" +que);
	    }
	}


