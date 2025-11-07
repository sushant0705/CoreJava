package OOPs;

import java.util.Scanner;

abstract class Login {
    String name;
    String password;

    Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    abstract boolean login(String inputName, String inputPass);
}

class Admin extends Login {
    Admin() {
        super("admin", "admin123");
    }

    boolean login(String inputName, String inputPass) {
        if (inputName.equals(name) && inputPass.equals(password)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Invalid ");
            return false;
        }
    }
    void questionSet() {
	}
//    	System.out.println("\nAdd a question");
//        System.out.print("Please enter the question: ");
//        String question = sc.nextLine();
//        System.out.print("Option 1: ");
//        String option1 = sc.nextLine();
//        System.out.print("Option 2: ");
//        String option2 = sc.nextLine();
//        System.out.print("Option 3: ");
//        String option3 = sc.nextLine();
//        System.out.print("Option 4: ");
//        String option4 = sc.nextLine();
    
}

class User extends Login {
    User() {
        super("user", "user123");
    }

    boolean login(String inputName, String inputPass) {
        if (inputName.equals(name) && inputPass.equals(password)) {
            System.out.println("User login successful!");
            return true;
        } else {
            System.out.println("Invalid User ");
            return false;
        }
    }
}

public class Testapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        User user = new User();

        boolean adminLogin = false;
        boolean userLogin = false;

        while (true) {
            System.out.println("\n1. Admin Login\n2. User Login\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 3) {
                System.out.println("Thank you!");
                break;
            }

            System.out.print("Enter username: ");
            String uname = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (choice == 1) {
                adminLogin = admin.login(uname, pass);
                if (adminLogin) break;
            } else if (choice == 2) {
                userLogin = user.login(uname, pass);
                if (userLogin) break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        
        if (adminLogin) {
            
        	admin.questionSet();
            
        }

        sc.close();
    }
}
