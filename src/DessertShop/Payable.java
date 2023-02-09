package DessertShop;

public interface Payable{
    enum payType{
        CASH,
        CARD,
        PHONE
    }
    String getPayType();
    void setPayType(String payType);
}

