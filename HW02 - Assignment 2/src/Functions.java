import java.util.LinkedList;
import java.util.Queue;
public class Functions {
	int nPosition;
	int j = 0;
	
	// create 10 Chasiers
	Queue<Integer> myCSH0 = new LinkedList<Integer>();
	Queue<Integer> myCSH1 = new LinkedList<Integer>();
	Queue<Integer> myCSH2 = new LinkedList<Integer>();
	Queue<Integer> myCSH3 = new LinkedList<Integer>();
	Queue<Integer> myCSH4 = new LinkedList<Integer>();
	Queue<Integer> myCSH5 = new LinkedList<Integer>();
	Queue<Integer> myCSH6 = new LinkedList<Integer>();
	Queue<Integer> myCSH7 = new LinkedList<Integer>();
	Queue<Integer> myCSH8 = new LinkedList<Integer>();
	Queue<Integer> myCSH9 = new LinkedList<Integer>();

	private Customer[] a;               // reference to array
	private int nElems;               // number of data items
	
	public Functions(int max){	//constructor
		a = new Customer[max];               // create the array
		nElems = 0;                        // no items yet
		}
	public void insert(int cust, int item){	// put person into array
		a[nElems] = new Customer(cust, item);
		nElems++;                          // increment size
		}
	public void displayA(){
		a[j].displayCustomer();          // display it
		j++;
	}
	// take the number of items by the customer and insert into a queue
	public void numItems(){
		nPosition = 0;
			
		int[] tmp = new int[10];
			
		tmp[0] = a[nPosition].getItems();
		nPosition++;
		tmp[1] = a[nPosition].getItems();
		nPosition++;
		tmp[2] = a[nPosition].getItems();
		nPosition++;
		tmp[3] = a[nPosition].getItems();
		nPosition++;
		tmp[4] = a[nPosition].getItems();
		nPosition++;
		tmp[5] = a[nPosition].getItems();
		nPosition++;
		tmp[6] = a[nPosition].getItems();
		nPosition++;
		tmp[7] = a[nPosition].getItems();
		nPosition++;
		tmp[8] = a[nPosition].getItems();
		nPosition++;
		tmp[9] = a[nPosition].getItems();
		nPosition++;
			
		myCSH0.add(tmp[0]);	//Inserts into the Queue
		myCSH1.add(tmp[1]);
		myCSH2.add(tmp[2]);
		myCSH3.add(tmp[3]);
		myCSH4.add(tmp[4]);
		myCSH5.add(tmp[5]);
		myCSH6.add(tmp[6]);
		myCSH7.add(tmp[7]);
		myCSH8.add(tmp[8]);
		myCSH9.add(tmp[9]);
		
		//creating checkout thread object
		Thread t0 = new Thread(new checkOUT(myCSH0));
		Thread t1 = new Thread(new checkOUT(myCSH1));
		Thread t2 = new Thread(new checkOUT(myCSH2));
		Thread t3 = new Thread(new checkOUT(myCSH3));
		Thread t4 = new Thread(new checkOUT(myCSH4));
		Thread t5 = new Thread(new checkOUT(myCSH5));
		Thread t6 = new Thread(new checkOUT(myCSH6));
		Thread t7 = new Thread(new checkOUT(myCSH7));
		Thread t8 = new Thread(new checkOUT(myCSH8));
		Thread t9 = new Thread(new checkOUT(myCSH9));
		
		//starting checkout thread
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
		try{
			//adding into chasier queue by comparing who is short
			for (int num = 1; num <= 990; num++){
				if (myCSH0.size() < myCSH9.size()){
					tmp[0] = a[nPosition].getItems();
					myCSH0.add(tmp[0]);
					nPosition++;
				}
				else if(myCSH1.size() < myCSH0.size()){
					tmp[1] = a[nPosition].getItems();
					myCSH1.add(tmp[1]);
					nPosition++;
				}
				else if(myCSH2.size() < myCSH1.size()){
					tmp[2] = a[nPosition].getItems();
					myCSH2.add(tmp[2]);
					nPosition++;
				}
				else if(myCSH3.size() < myCSH2.size()){
					tmp[3] = a[nPosition].getItems();
					myCSH3.add(tmp[3]);
					nPosition++;
				}
				else if(myCSH4.size() < myCSH3.size()){
					tmp[4] = a[nPosition].getItems();
					myCSH4.add(tmp[4]);
					nPosition++;
				}
				else if(myCSH5.size() < myCSH4.size()){
					tmp[5] = a[nPosition].getItems();
					myCSH5.add(tmp[5]);
					nPosition++;
				}
				else if(myCSH6.size() < myCSH5.size()){
					tmp[6] = a[nPosition].getItems();
					myCSH6.add(tmp[6]);
					nPosition++;
				}
				else if(myCSH7.size() < myCSH6.size()){
					tmp[7] = a[nPosition].getItems();
					myCSH7.add(tmp[7]);
					nPosition++;
				}
				else if(myCSH8.size() < myCSH7.size()){
					tmp[8] = a[nPosition].getItems();
					myCSH8.add(tmp[8]);
					nPosition++;
				}
				else if(myCSH9.size() < myCSH8.size()){
					tmp[9] = a[nPosition].getItems();
					myCSH9.add(tmp[9]);
					nPosition++;
				}
				else{
					tmp[0] = a[nPosition].getItems();
					myCSH0.add(tmp[0]);
					nPosition++;
				}
			Thread.sleep(10);//sleeps for 10 milli seconds 
			}
		}catch(Exception e){
			System.out.println("OVERFLOW, but its okay.");
		}// displays when loop overflows
	}
}