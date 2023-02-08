package DessertShop;

public class IceCream extends DessertItem {

	//Attributes
	protected int scoopCount;
	protected double pricePerScoop;

	//Constructors
	//default
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0.0;
		setPackaging("");

	}

	//full constructor
	public IceCream(String n, int sc, double pps) {
		super(n);
		scoopCount = sc;
		pricePerScoop = pps;
		setPackaging("Bowl");

	}

	//Methods
	public double getScoopCount() {
		return scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setScoopCount(int sc) {//setters are void
		scoopCount = sc;
	}

	public void setPricePerScoop(double pps) {//setters are void
		pricePerScoop = pps;
	}
	
	public double calculateCost() {
		return pricePerScoop * scoopCount;
	}

	public String toString(){
		String line1 = String.format("%s (%s)",getName(), getPackaging());
		String line2 = String.format("%d lbs.    @ $%.2f/lbs.:",scoopCount, pricePerScoop);
		String line3 = String.format("$%.2f",calculateCost());
		String line4 = String.format("[TAX: $%.2f]",calculateTax());

		String output = String.format("%-25s%-30s%s%17s",line1,line2,line3,line4);





		return output;
	}
}
