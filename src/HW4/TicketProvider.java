package HW4;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider extends CashProvider {

    public Ticket ticket;
    // public List<Ticket> ticketList;

    public List<Ticket> sellTicketsProvider(int customerId, int countTickets, Ticket ticket) throws Exception {
        // ticket = new Ticket();
        List<Ticket> ticketList = new ArrayList<>();
        if (balanceCardCustomer(customerId) >= (ticket.getPrice() * countTickets)) {
            transactionMinus(ticket.getPrice() * countTickets);
            while (countTickets != 0) {
                ticketList.add(ticket);
                countTickets--;
            }
            return ticketList;
        } else
            throw new Exception("Недостаточно средств");
    }

    public boolean updateTicketStatus(Ticket ticket) {
        return false;
    }

}