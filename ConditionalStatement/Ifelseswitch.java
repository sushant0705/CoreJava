package ConditionalStatement;

import java.util.Scanner;

public class Ifelseswitch {

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
			System.out.println("1=Full stack java");
			System.out.println("2=Full stack python");
			System.out.println("3=Full stack web devlopment");
			System.out.println("4=Mern stack");
			System.out.println("enter the choice for job");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("you selected for the full stack java devlopemnt");
				break;
				
			case 2:
				System.out.println("you selected for the full stack python devlopemnt");
				break;
				
				
			case 3:
				System.out.println("you selected for the full stack web devlopemnt");
				break;
				
				
			case 4:
				System.out.println("you selected for the mern stack devlopment");
				break;
				
			default:
				System.out.println("please select valid option");
			}
			
		}
		else {
			System.out.println("your grade is B with " + percentage + " percentage");
		}

	}

}
