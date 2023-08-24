package HW4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, 10000.00);
        Customer customer2 = new Customer(2, 20000.00);
        Customer customer3 = new Customer(3, 30000.00);
        Customer customer4 = new Customer(4, 40000.00);
        List<Ticket> tickets = new ArrayList<Ticket>();
//        метро,автобус,театр,самолёт
        Ticket ticket1 = new Ticket(1, "Train", 2627.00, "Saint Petersburg - Moscow",
                LocalDateTime.now());
        Ticket ticket2 = new Ticket(2, "Bus", 30.00, "Tverskaya - Novoslobodskaya",
                LocalDateTime.now());
        Ticket ticket3 = new Ticket(3, "Grand Theatre", 3000.00, "Knyaz Igor",
                LocalDateTime.now());
        Ticket ticket4 = new Ticket(4, "Airplane", 30000.00, "Moscow - Istanbul",
                LocalDateTime.now());
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        System.out.println(tickets);
        System.out.println(ticket1 + " " + customer1);
        System.out.println(ticket2 + " " + customer2);
        System.out.println(ticket3 + " " + customer3);
        System.out.println(ticket4 + " " + customer4);
        System.out.println(customer4);
        System.out.println(customer4.buyTicket(ticket1, customer4));
        System.out.println(customer4);
        System.out.println(customer4.buyTicket(ticket2, customer4));
        System.out.println(customer4);
        System.out.println(customer4.buyTicket(ticket3, customer4));
        System.out.println(customer4);
        System.out.println(customer4.buyTicket(ticket4, customer4));
        System.out.println(customer4);
        System.out.println(customer1.search(1));

    }
}