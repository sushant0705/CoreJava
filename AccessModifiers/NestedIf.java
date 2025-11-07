package AccessModifiers;
import java.util.*;

public class NestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 35) {
                System.out.println("You passed.");

                if (marks >= 60) {
                    System.out.println("You passed with First Class.");

                    if (marks >= 75) {
                        System.out.println("You secured a Distinction.");

                        if (marks >= 85) {
                            System.out.println("You achieved High Distinction!");

                            if (marks >= 95) {
                                System.out.println("Outstanding performance!");
                            }
                        }
                    }
                }
            } else {
                System.out.println("You failed.");
            }
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        
    }
}
