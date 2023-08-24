package HW4;

public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false;
    }

    public void authorization(Customer customer) {
        isAuthorization = true;
        if (customer.getId() == null) {
            isAuthorization = false;
        }
    }

    public boolean buy(Double amount, Double price) {
        if (isAuthorization && cardHasFunds(amount, price)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cardHasFunds(Double amount, Double price) {
        if (amount != null && amount >= price) {
            return true;
        }
        return false;
    }
}