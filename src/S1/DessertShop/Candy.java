package DessertShop;

public class Candy  extends DessertItem implements SameItem<Candy>{
	
	
	//Attributes
	private double candyWeight;
	private double pricePerPound;
	
	//Constructors
	//default
	public Candy() {
		super();
		candyWeight = 0.0;
		pricePerPound = 0.0;
		setPackaging("");
	}
	
	//full constructor
	public Candy(String n, double cw, double ppp) {
		super(n);
		candyWeight = cw;
		pricePerPound = ppp;
		setPackaging("Bag");
	}
	
	//Methods
	public double getCandyWeight() {
		return candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}
	
	public void setCandyWeight(double cw) {//setters are void
		candyWeight = cw;
	}
	
	public void setPricePerPound(double ppp) {//setters are void
		pricePerPound = ppp;
	}
	
	public double calculateCost() {
		return candyWeight*pricePerPound;
	}

	public String toString(){
		String line1 = String.format("%s (%s)",getName(), getPackaging());
		String line2 = String.format("%.2f lbs. @ $%.2f/lbs.:",candyWeight, pricePerPound);
		String line3 = String.format("$%.2f",calculateCost());
		String line4 = String.format("[TAX: $%.2f]",calculateTax());

		String output = String.format("%-25s%-30s%s%17s",line1,line2,line3,line4);

		return output;
	}

	//lab 7a 
	public boolean isSameAs(Candy other) {
		
		if(this.getName().equals(other.getName()) && ((this.getCandyWeight() == (other.getCandyWeight())))) {
			return true;
		}
		return false;
	}

}
