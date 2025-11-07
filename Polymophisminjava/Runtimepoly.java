package Polymophisminjava;

import java.util.Scanner;

class Domain {
    void showDomain() {
        System.out.println("General domain selected.");
    }
}

class JavaDomain extends Domain {
    void showDomain() {
        System.out.println("You are selected for the Java domain.");
    }
}

class DotNetDomain extends Domain {
    void showDomain() {
        System.out.println("You are selected for the .NET domain.");
    }
}

class PythonDomain extends Domain {
    void showDomain() {
        System.out.println("You are selected for the Python domain.");
    }
}

public class Runtimepoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Domain domain=new Domain();
        System.out.println("enter your id");
        int id = sc.nextInt();
        System.out.println("enter you password");
        int password = sc.nextInt();

        
        if (id==101 && password==123456) {
            System.out.println("Login Successful");
            System.out.println("Welcome to ITP");

            System.out.println("\nEnter your marks for domain selection:");
            System.out.print("C1 marks: ");
            int c1 = sc.nextInt();
            System.out.print("c2 marks: ");
            int c2 = sc.nextInt();
            System.out.print("c3 marks: ");
            int c3 = sc.nextInt();
            System.out.print("c4 marks: ");
            int c4 = sc.nextInt();
            

            int total = c1+c2+c3+c4;
            System.out.println("Total Marks: " + total);

            if (total >= 150) {
                domain = new JavaDomain();
            } else if (total >= 140) {
                domain = new DotNetDomain();
            } else if (total >= 120) {
                domain = new PythonDomain();
            } else {
                domain = new Domain();
            }

            domain.showDomain(); 
        } else {
            System.out.println("Login Failed");
        }
    }
}

