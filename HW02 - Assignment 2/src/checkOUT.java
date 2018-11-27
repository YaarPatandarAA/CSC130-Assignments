import java.util.*;
// thread to checkout customers in queue
class checkOUT implements Runnable{
    int time;
    Random r = new Random();
    Queue<Integer> q = new LinkedList<Integer>();//creating local queue
    
    public checkOUT(Queue<Integer> x){//passing queue into thread
    	q = x; //inputing our queue into thread queue
    }
    
    public void run(){
        try{
        	Thread.sleep(1000);// waiting 1 second before removing queue
        	for(int num = 1; num <= 5000; num++){// removes from queue one at time
        		time = q.peek();
        		int number = time * 10;
        		Thread.sleep(number);
        		q.remove();
        	}
        }catch(Exception e){
        	System.out.println("Queue is Empty"); //lets user know queue is empty
        }
    }
}