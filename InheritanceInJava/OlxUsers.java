package InheritanceInJava;

import java.util.Scanner;


class Users {
    String name;
    String product;
}

interface Buyer {
    void buy(String productName);
}

interface Seller {
    void sell(String productName);
}

public class OlxUsers extends Users implements Buyer, Seller {

    @Override
    public void sell(String productName) {
        System.out.println(name + " wants to sell " + productName);
    }

    @Override
    public void buy(String productName) {
        System.out.println(name + " wants to buy " + productName);
    }

    // ✅ Main method must be inside a class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OlxUsers o = new OlxUsers();

        System.out.print("Enter your name: ");
        o.name = sc.nextLine();

        System.out.print("Enter the product: ");
        o.product = sc.nextLine();

        System.out.print("Enter your choice (1 for Buy, 2 for Sell): ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                o.buy(o.product);
                break;
            case 2:
                o.sell(o.product);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
