package RealEstate;


abstract class  Property {
    private String streetAdress;
    private int zip;
    double listPrice = 0;
    double appraisalPrice = 0;

    public double getListPrice() {
        return listPrice;
    }
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }
    public double getAppraisalPrice() {
        return appraisalPrice;
    }
    protected void setAppraisalPrice(double appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }
    
    abstract double calculateAppraisalPrice();


    Property(){
        streetAdress = "";
        zip = 0;
    }
    Property(String a, int b){
        streetAdress = a;
        zip =b;
    }

    public String getStreetAdress(){
        return streetAdress;
    }
    public int getZip(){
        return zip;
    }

    public void setStreetAdress(String a){
        streetAdress = a;
    }
    public void setZip(int a){
        zip = a;
    }


    
}
