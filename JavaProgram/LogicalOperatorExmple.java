package JavaProgram;
import java.util.*;


public class LogicalOperatorExmple {
	void studentResult() {
		System.out.println("-----Enter your detail to check your result-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int rollNo=sc.nextInt();
		System.out.println("enter the marks of sub1 = ");
		double sub1=sc.nextDouble();
		System.out.println("enter the marks of sub2 = ");
		double sub2=sc.nextDouble();
		System.out.println("enter the marks of sub3 = ");
		double sub3=sc.nextDouble();
		double percentage=(sub1+sub2+sub3)*100/300;
		System.out.println("your percentage is = "+percentage);
		if(sub1>=35 && sub1>=35 && sub3>=35) {
			System.out.println("the "+rollNo+" roll number pass in the exam");
		
		}
		else {
			System.out.println("the "+rollNo+" roll number fail in the exam");
		}

	}
	public static void main(String[] args) {
		
		LogicalOperatorExmple r=new LogicalOperatorExmple();
		r.studentResult();
	}

}
