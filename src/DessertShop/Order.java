package DessertShop;

import java.util.*;

public class Order implements Payable{
	//Attributes
	private ArrayList<DessertItem> order;
	public static payType payMethod;
	//Constructors
	public Order() {
		order = new ArrayList<DessertItem>();
		payMethod = payMethod.CASH;
	}
	
	//Methods
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}
	
	public void add(DessertItem NEWdi) { 
		
		if(NEWdi instanceof Candy) {
			for(DessertItem existing : this.order) {
				if(existing instanceof Candy) {
					if(((Candy) NEWdi).isSameAs((Candy)existing)) {
						((Candy)existing).setCandyWeight(((Candy)existing).getCandyWeight() + ((Candy)NEWdi).getCandyWeight());
						return;
					}//end of if NEWid is Same As Candy
				}
			}
				} else if(NEWdi instanceof Cookie) {
					for(DessertItem existing1 : this.order) {
						if(existing1 instanceof Cookie) {
							if(((Cookie) NEWdi).isSameAs((Cookie)existing1)) {
								((Cookie)existing1).setCookieQty((int) (((Cookie)existing1).getCookieQty() + ((Cookie)NEWdi).getCookieQty()));
								return;
							}
						}
					}//end of if NEWid is Same As Cookie
				}//end of for loop
			
		//end of instanceof Candy
		order.add(NEWdi);
		
	} // end of add method
	
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
		finalOutPut += String.format("Paid for with %s", payMethod);
		finalOutPut += String.format("\n");
		finalOutPut += "------------------------------------------------------------------------------\n";

		if(hashmop === get usr){
			hash id

		}


		finalOutPut += String.format("Customer Name: %s, Customer ID: %d", Customer.getName(), (Customer.getID()));
		finalOutPut += String.format("\n");
		

		return finalOutPut;
	}

	public payType getPayType() {
		return payMethod;
	}

	public void setPayType(payType n) {
		payMethod = n;
	}

}
