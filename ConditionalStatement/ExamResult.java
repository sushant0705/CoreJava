package ConditionalStatement;
import java.util.*;

public class ExamResult {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();

        if (marks >= 35) {
            if (marks >= 60) {
                System.out.println("You passed with First Class.");
            } else {
                System.out.println("You passed.");
            }
        } else {
            System.out.println("You failed.");
        }

	}

}
