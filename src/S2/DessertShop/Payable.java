package DessertShop;

public interface Payable{
    enum payType{
        CASH,
        CARD,
        PHONE
    }
    payType getPayType();
    void setPayType(payType n);
}

