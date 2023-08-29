package HW4;

public class Ticket {

    private long rootNumber;
    private double price;
    private int place;
    private boolean isValid;

    public long getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(long rootNumber) {
        this.rootNumber = rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;

    }

    public Ticket(long rootNumber, double price, int place, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        // this.date = date;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket [rootNumber=" + rootNumber + ", price=" + price + ", place=" + place + ", isValid=" + isValid + "]";
    }
}