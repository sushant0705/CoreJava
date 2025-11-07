package ConditionalStatement;
import java.util.*;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of java");
		int javaMarks=sc.nextInt();
		System.out.println("enter the marks of sql");
		int sqlMarks=sc.nextInt();
		System.out.println("enter the marks of react");
		int reactMarks=sc.nextInt();
		float totalMarks=javaMarks+sqlMarks+reactMarks;
		float percentage=totalMarks/3;
		if(percentage>=80) {
			
			System.out.println("your grade is A with " + percentage + " percentage");
		}
		else {
			System.out.println("your grade is B with " + percentage + " percentage");
		}
		
		

	}

}
