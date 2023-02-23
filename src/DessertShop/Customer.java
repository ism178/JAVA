package DessertShop;
import java.util.*;

public class Customer {

	//Attributes
	private static String custName;
	private ArrayList<Order>orderHistory;
	private static int custID;
	private int nextCustID = 1000;
	
	//Constructors
	public Customer(String cN) {
		custName = cN;
	}
	
	//Methods
	public static String getName() {
		return custName;
	}
	
	public static int getID() {
		return custID;
	}
	
	public ArrayList<Order>getOrderHistory(){
		return orderHistory;
	}
	
	public void setName(String n) {
		custName = n;
	}
	
	public void addToHistory(Order o) {
		
	}
	
}
