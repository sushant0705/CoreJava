package CollectionFrameworkInJava;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TicketBooking {

    static Scanner sc = new Scanner(System.in);
    static Queue<String> queue = new ArrayDeque<>();
    static int[] tickets;
    static int available = 10;

    public static void takeInput(int n) {
        tickets = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            queue.add(name); 

            System.out.print("Tickets needed: ");
            tickets[i] = sc.nextInt();
            sc.nextLine(); 
        }
    }

    public static void processBooking() {
        int i = 0;
        while (!queue.isEmpty()) {
            String name = queue.remove(); 
            int need = tickets[i];

            if (need <= available) {
                System.out.println(name + " got " + need + " tickets.");
                available =available- need;
            } else {
                System.out.println( name + " only " + available + " tickets left.");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.print("How many people: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        takeInput(n);
        System.out.println("Booking is process");
        processBooking();

        sc.close();
    }
}
