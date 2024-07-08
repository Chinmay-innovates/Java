package Basic.lab;

/**
 * TicketBooking
 */
class TicketBooking {
    private int availabelTickets = 20;

    public synchronized void bookTickets(String passengerName, int numOfTickets) throws InterruptedException {

        if (numOfTickets <= availabelTickets) {
            System.out.println(passengerName + " is trying to book " + numOfTickets + " ticket(s).");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availabelTickets -= numOfTickets;
            System.out.println(passengerName + " has successfully booked " + numOfTickets + " ticket(s).");
            System.out.println("Remaining tickets: " + availabelTickets);
        } else {
            System.out.println(passengerName + " could not book " + numOfTickets + " ticket(s). There are only "
                    + availabelTickets + " available.");
        }
    }
}

/**
 * BookingThread
 */
class BookingThread extends Thread {
    private TicketBooking tb;
    private String passengerName;
    private int numOfTickets;

    public BookingThread(TicketBooking tb, String passengerName, int numOfTickets) {
        this.tb = tb;
        this.passengerName = passengerName;
        this.numOfTickets = numOfTickets;
    }

    @Override
    public void run() {
        try {
            tb.bookTickets(passengerName, numOfTickets);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        BookingThread thread1 = new BookingThread(tb, "Alice", 5);
        BookingThread thread2 = new BookingThread(tb, "Bob", 4);
        BookingThread thread3 = new BookingThread(tb, "Sam", 1);
        BookingThread thread4 = new BookingThread(tb, "Sam Brother", 11);
        thread1.start(); 
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
