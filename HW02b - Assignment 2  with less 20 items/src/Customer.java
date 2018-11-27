public class Customer {
	private int nCustomer;
	private int nItems;
//--------------------------------------------------------------
	public Customer(int cust, int item){                               // constructor
		nCustomer = cust;
		nItems = item;
	}
	public void displayCustomer(){
		 System.out.println("      " + nCustomer + "         |      " + nItems + "     ");
    }
	public int getItems(){          // get number of items
		return nItems;
	}
	public int getCustomer(){          // get last name
		return nCustomer;
	}
}
