package JavaProgram;

import java.util.Scanner;

class Users {
    String name;
   
}

interface Buyer {
    void buy(String productName);
}

interface Seller {
    void sell(String productName);
}

public class User extends Users implements Buyer, Seller {

    @Override
    public void sell(String productName) {
        System.out.println(name + " wants to sell " + productName);
    }

    @Override
    public void buy(String productName) {
        System.out.println(name + " wants to buy " + productName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User o = new User();

        System.out.print("Enter your name: ");
        o.name = sc.nextLine();

        System.out.print("Enter the product: ");
        String product = sc.nextLine();

        System.out.print("Enter your choice (1 for Buy, 2 for Sell): ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                o.buy(product);
                break;
            case 2:
                o.sell(product);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
