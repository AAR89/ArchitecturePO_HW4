package HW4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Integer id;
    private List<Ticket> tickets;
    private List<Integer> customers;
    private Double cash;

    public Customer(int id, Double cash) {
        this.id = id;
        this.tickets = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.cash = cash;
    }

    public Integer getId() {
        return id;
    }

    public Double setCash(Double cash) {
        this.cash = cash;
        return cash;
    }

    public boolean buyTicket(Ticket ticket, Customer customer) {
        if (cash != null && cash >= ticket.getPrice()) {
            cash -= ticket.getPrice();
            setCash(cash);
            tickets.add(ticket);
            customers.add(customer.id);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", cash=" + cash +
                '}';
    }

    public List<Ticket> search(long rootNumber) {
        for (Ticket ticket : tickets
        )
            if (tickets.equals(rootNumber)) {
                System.out.println(ticket); // не работает, выдаёт пустой массив
            }
        return new ArrayList<>();
    }
}
