package JavaProgram;

import java.util.Scanner;


class User2 {
    String username;
    String password;

    User2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

public class TestApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        User2 admin = new User2("admin", "123");
        User2 student = new User2("student", "123");

        System.out.println("Login as:\n1. Admin\n2. Student");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (choice == 1 && admin.login(uname, pass)) {
            System.out.println("Admin login successful!");
        } else if (choice == 2 && student.login(uname, pass)) {
            System.out.println("Student login successful!");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
