package DessertShop;

import java.util.*;

public class Order implements Payable{
	//Attributes
	private ArrayList<DessertItem> order;
	private PayType payMethond;
	//Constructors
	public Order() {
		order = new ArrayList<DessertItem>();
		payMethod = PayTipe.CASH;
	}
	
	//Methods
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}
	
	public void add(DessertItem di) {
		order.add(di);
	}
	
	public int itemCount() {
		return order.size();
	}
	
	public double orderCost() {
		double totalCost = 0;
		for(DessertItem o : order) {
			totalCost += o.calculateCost();
		}
		return totalCost;
	}
	
	public double orderTax() {
		double totalTax = 0;
		for(DessertItem o : order) {
			totalTax += o.calculateTax();
		}
		return totalTax;
	}
	public String toString(){
		String finalOutPut = "";
		finalOutPut += "--------------------------------------Receipt---------------------------------\n";
		for (DessertItem e : getOrderList()) {
			finalOutPut += e.toString() + "\n";
		}
		finalOutPut += "------------------------------------------------------------------------------\n";
		
		finalOutPut += String.format("Total items in the order: " +  itemCount(), "\n");
		finalOutPut += String.format("\n");
		double orderTotal = orderCost() + orderTax();
		finalOutPut += String.format("%-25s$%-8.2f[Tax: $%.2f]\n",  "Order Subtotals: ", orderCost(), orderTax(), "\n");
		finalOutPut += String.format("%-25s$%-8.2f\n", "Order Total: ", orderTotal, "\n");
		finalOutPut += "------------------------------------------------------------------------------\n";
	

		return finalOutPut;
	}

	public String getPayType() {
		return null;
	}

	public void setPayType(String payType) {
		
	}

}
