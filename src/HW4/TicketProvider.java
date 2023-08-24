package HW4;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List<Ticket> availableTickets;

    public TicketProvider() {
        this.availableTickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        return availableTickets.add(ticket);
    }

    public boolean removeTicket(Ticket ticket) {
        return availableTickets.remove(ticket);
    }

    public List<Ticket> getTicket(long rootNumber) {
        return new ArrayList<>();
    }

    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }
}
