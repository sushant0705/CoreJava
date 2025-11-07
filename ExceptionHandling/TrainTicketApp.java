

package ExceptionHandling;

import java.util.Scanner;

class BookingException extends Exception {
    public BookingException(String message) {
        super(message);
    }
}

class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}

class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class TrainTicketApp {
    static Scanner sc = new Scanner(System.in);
    static String[] usernames = new String[20];
    static String[] passwords = new String[20];
    static boolean[] hasBooked = new boolean[20];
    static int userCount = 0;
    static int availableSeats = 10;

    public static void register() {
        if (userCount >= usernames.length) {
            System.out.println("User registration limit reached ....");
            return;
        }

        System.out.println("Please enter username:- ");
        String username = sc.next();

        System.out.println("Please enter password:- ");
        String password = sc.next();

        usernames[userCount] = username;
        passwords[userCount] = password;
        hasBooked[userCount] = false;
        userCount++;

        System.out.println("Registration successful");
    }

    public static void login() throws InvalidLoginException {
        System.out.println("Please enter username:- ");
        String username = sc.next();

        System.out.println("Please enter password:- ");
        String password = sc.next();

        int index = -1;
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new InvalidLoginException("Invalid username or password");
        }

        System.out.println("Login Successful");
        menu(index);
    }

    public static void viewSeats() {
        System.out.println("Available Seats:- " + availableSeats);
    }

    public static void bookTicket(int userIndex) throws BookingException {
        if (availableSeats <= 0) {
            throw new BookingException("No seats are available");
        }
        if (hasBooked[userIndex]) {
            throw new BookingException("You have already booked a seat");
        }

        System.out.println("Enter payment amount (100): ");
        int amount = sc.nextInt();

        try {
            makePayment(amount);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
            return; // prevent booking after failed payment
        }

        availableSeats--;
        hasBooked[userIndex] = true;
        System.out.println("Ticket is booked for : " + usernames[userIndex]);
        System.out.println("Ticket Payment Invoice : " + amount + " | Booking Ticket ID " + System.currentTimeMillis());
    }

    public static void makePayment(int amount) throws PaymentException {
        if (amount < 100) {
            throw new PaymentException("Payment Failed. It required minimum 100 $");
        }
        System.out.println("Payment successful");
    }

    public static void cancelTicket(int userIndex) throws BookingException {
        if (!hasBooked[userIndex]) {
            throw new BookingException("You have not booked any ticket to cancel.");
        }

        availableSeats++;
        hasBooked[userIndex] = false;
        System.out.println("Your ticket has been successfully cancelled.");
    }

    public static void menu(int userIndex) {
        while (true) {
            System.out.println("1. View Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Logout");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> viewSeats();
                    case 2 -> bookTicket(userIndex);
                    case 3 -> cancelTicket(userIndex);
                    case 4 -> {
                        System.out.println("Logged out....");
                        return;
                    }
                    default -> System.out.println("Invalid Choice");
                }
            } catch (BookingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Chennai Express Application");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> register();
                case 2 -> {
                    try {
                        login();
                    } catch (InvalidLoginException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("Exit the app");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
