package DessertShop;

public class Sundae extends IceCream{
	
	//Attributes
	private String toppingName;
	private double toppingPrice;

	//Constructors
	//default
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.0;
		setPackaging("");

	}

	//full constructor
	public Sundae(String n, int sc, double pps, String tn, double tp) {
		super(n, sc, pps);
		toppingName = tn;
		toppingPrice = tp;
		setPackaging("Boat");

	}

	//Methods
	public String getToppingName() {
		return toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingName(String tn) {//setters are void
		toppingName = tn;
	}

	public void setToppingPrice(double tp) {//setters are void
		toppingPrice = tp;
	}
	
	public double calculateCost() {
		return toppingPrice + super.calculateCost();
	}

	public String toString(){
		String line1 = String.format("%s (%s)",getName(), getPackaging());
		String line2 = String.format("%d lbs.    @ $%.2f/lbs.:",scoopCount , pricePerScoop);
		String line3 = String.format("$%.2f",calculateCost());
		String line4 = String.format("[TAX: $%.2f]",calculateTax());
		String line5 = String.format("%s",getToppingName());
		String line6 = String.format("%.2f",toppingPrice);

		String output = String.format("%-25s%-30s%s%17s",line1,line2,line3,line4,line5,line6);




		return output;
	}
}
