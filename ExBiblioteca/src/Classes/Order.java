package Classes;

public class Order {
    private int ID;
    private User user;
    private Book book;
    private ShipperInfo shippeInfo;
    private BillingInfo billingInfo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ShipperInfo getShippeInfo() {
        return shippeInfo;
    }

    public void setShippeInfo(ShipperInfo shippeInfo) {
        this.shippeInfo = shippeInfo;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo bllingInfo) {
        this.billingInfo = bllingInfo;
    }
       
    public void modify(){}
    public void checkAvailibility(){}
    public void isFulfilled(){}
}
