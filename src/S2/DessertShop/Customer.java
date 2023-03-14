package DessertShop;
import java.util.*;

public class Customer {

	//Attributes
	private String custName;
	private ArrayList<Order>orderHistory;
	private  int custID;
	private static int nextCustID = 1000;
	
	//Constructors
	public Customer(String cN) {
		custName = cN;
		custID = nextCustID++;
		orderHistory = new ArrayList<Order>();
	}
	
	//Methods
	public String getName() {
		return custName;
	}
	
	public int getID() {
		return custID;
	}
	
	public ArrayList<Order>getOrderHistory(){
		return orderHistory;
	}
	
	public void setName(String n) {
		custName = n;
	}
	
	public void addToHistory(Order o){
		orderHistory.add(o);
	}
	
}
