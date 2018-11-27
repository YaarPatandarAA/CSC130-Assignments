import java.util.Random;
public class CreateCust implements Runnable{
	Random myRND = new Random(); //random variable creation
    Random rnd = new Random();	// random variable creation
    int someNUM = 1; // used for simply seeing the counter number
    int maxSize = 1000;             // array size
    Functions arr = new Functions(maxSize);          // reference to and creation of array
    
    public void run(){ // following is timer thread
        try{
        	for (int num = 1; num <= 80; num++){
        		System.out.println("Current time: " + num);
        		Thread.sleep(1000);
        	}
        }catch(Exception e){}
    }
	
	public void CreateCustomer(){
	    Thread timer = new Thread(new CreateCust());
	    
		try{
			System.out.println("Creating Customers and their Items. Will show Shortly. \n"
					+ "*note* Customer is being generated at 1-10 ticks randomly \n");
			System.out.println("Customer Number | Number of Items");
			System.out.println("---------------------------------");
			// for loop will loop multiple times to fill customer items and create customer
			for(int custNUM = 1; custNUM <= 1000; custNUM++){
				int amt = rnd.nextInt(10) + 1; // will generate a random number between 1-10

				Thread.sleep(amt); // will sleep until number items (milliseconds)
				
				int amtITEMS = myRND.nextInt(100) + 1; // will generate a random number between 1-100 that will be used as customer items		
				arr.insert(custNUM, amtITEMS); // customer number will be inserted and random amount of items will be inserted.
				arr.displayA(); 
			}
		}catch(Exception e){};
		timer.start();
		System.out.println("Now the customers are being stored into the Chasiers and being Checked out. \n"
				+ "note* queue empty message will display 10 times when all 10 chasiers are done \n"
				+ "Thank You!");
		arr.numItems();
	}
}