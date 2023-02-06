package DessertShop;

public class Cookie extends DessertItem {

	//Attributes
	private int cookieQty;
	private double pricePerDozen;

	//Constructors
	//default
	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0.0;
	}

	//full constructor
	public Cookie(String n, int cq, double ppd) {
		super(n);
		cookieQty = cq;
		pricePerDozen = ppd;
	}

	//Methods
	public double getCookieQty() {
		return cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public void setCookieQty(int cq) {//setters are void
		cookieQty = cq;
	}

	public void setPricePerDozen(double ppd) {//setters are void
		pricePerDozen = ppd;
	}
	
	public double calculateCost() {
		return (cookieQty*pricePerDozen)/12;
	}
	public String toString(){
		String line1 = String.format("%s",getName());
		String line2 = String.format("%d lbs.    @ $%.2f/lbs.:",cookieQty, pricePerDozen);
		String line3 = String.format("$%.2f",calculateCost());
		String line4 = String.format("[TAX: $%.2f]",calculateTax());

		String output = String.format("%-25s%-30s%s%17s",line1,line2,line3,line4);





		return output;
	}

}
