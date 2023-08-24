package HW4;

import java.time.LocalDateTime;

class Ticket {
    private long rootNumber;
    private String type;
    private Double price;
    private String place;
    private LocalDateTime date;
    private boolean isValid;

    public Ticket(long rootNumber, String type, Double price, String place, LocalDateTime date) {
        this.rootNumber = rootNumber;
        this.type = type;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true;
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public String getPlace() {
        return place;
    }


    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber = " + rootNumber +
                ", type = " + type +
                ", price = " + price +
                ", place = " + place +
                ", date = " + date +
                ", isValid = " + isValid +
                '}';
    }

    public boolean isValid() {
        return isValid;
    }

    public void cancel() {
        isValid = false;
    }
}