package JavaProgram;

import java.util.Scanner;

class Domain{
	void showDomain() {
		System.out.println("Repeat all session");
	}
	void changeDomain() {
		
		
	}
}
class JavaDomain extends Domain{
	void showDomain() {
		System.out.println("your are selected for the java");
	}
}
class DotNet extends Domain{
	void showDomain() {
		System.out.println("your are selected for the dot net");
	}
}

public class RunPoly {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Domain domain;
		int ch;
		boolean loggedIn=false;
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your password");
		String password=sc.nextLine();
		if(name.equalsIgnoreCase("Sushant Shinde")&& password.equalsIgnoreCase("admin123")) {
			System.out.println("Login successfull");
			loggedIn=true;
			System.out.println("enter marks of c1: ");
			int c1=sc.nextInt();
			sc.nextLine();
			System.out.println("enter marks of c2: ");
			int c2=sc.nextInt();
			sc.nextLine();
			System.out.println("enter marks of c3: ");
			int c3=sc.nextInt();
			sc.nextLine();
			System.out.println("enter marks of c4: ");
			int c4=sc.nextInt();
			sc.nextLine();
			
			float totalMarks=c1+c2+c3+c4;
			 if(totalMarks>=100 && totalMarks<=150) {
				 domain=new JavaDomain();
			 }
			 else if(totalMarks>=150 && totalMarks<=200) {
				 domain=new DotNet();
			 }
			 else {
				 domain=new Domain();
			 }
			 domain.showDomain();
		}else {
			System.out.println("Login failed");
			loggedIn=false;
		}
		if(loggedIn) {
			System.out.println("You are want the provide domain or change it");
			System.out.println("For change domain\n1:Java\n2:Dot Net");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("you are choose java domain");
				break;
			case 2:
				System.out.println("you are choose dot net domain");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}

	}

}
