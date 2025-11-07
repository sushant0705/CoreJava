package ConditionalStatement;
import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        int amount;

        do {
            System.out.print("Enter your PIN: ");
            pin = sc.nextInt();
            System.out.print("Enter amount to withdraw: ");
            amount = sc.nextInt();  

            System.out.println("Withdrawn: ₹" + amount);
            
        } while (amount <= 5000);

        sc.close(); // Always a good practice!
    }
}