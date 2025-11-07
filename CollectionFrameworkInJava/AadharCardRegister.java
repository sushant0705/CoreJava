package CollectionFrameworkInJava;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AadharCardRegister {

    static Scanner scanner = new Scanner(System.in);
    static Set<String> aadharNumbers = new HashSet<String>();

    public static void main(String[] args) {
        int choice;

        System.out.println("Welcome to Aadhar Card Registration ");

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    registerAadhar();
                    break;
                case 2:
                    showAllAadharNumbers();
                    break;
                case 3:
                    checkAadharNumber();
                    break;
                case 0:
                    System.out.println("Thank you .");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    public static void displayMenu() {
        System.out.println("=====Menu=====");
        System.out.println("1. Register Aadhar Number");
        System.out.println("2. Show All Registered Aadhar Numbers");
        System.out.println("3. Check if Aadhar Number is Registered");
        System.out.println("0. Exit");
    }

    public static void registerAadhar() {
        System.out.print("Enter Aadhar Number: ");
        String aadhar = scanner.nextLine();

        if (aadhar.length() == 12) {
            if (aadharNumbers.add(aadhar)) {
                System.out.println("Aadhar number registered successfully.");
            } else {
                System.out.println("Aadhar number is already registered.");
            }
        } else {
            System.out.println("Invalid Aadhar number.");
        }
    }

    public static void showAllAadharNumbers() {
        if (aadharNumbers.isEmpty()) {
            System.out.println("No Aadhar numbers registered .");
        } else {
            System.out.println("Registered Aadhar Numbers:");
            for (String aadhar : aadharNumbers) {
                System.out.println(aadhar);
            }
        }
    }

    public static void checkAadharNumber() {
        System.out.print("Enter Aadhar Number to check: ");
        String aadhar = scanner.nextLine();

        if (aadharNumbers.contains(aadhar)) {
            System.out.println("Aadhar number is already registered.");
        } else {
            System.out.println("Aadhar number is not registered.");
        }
    }
}
