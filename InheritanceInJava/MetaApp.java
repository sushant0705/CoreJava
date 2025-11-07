package InheritanceInJava;

import java.util.Scanner;

public class MetaApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username");
		String userName=sc.nextLine();
		System.out.println("Enter company choice (Whatsaapp or Instagram");
		String companyChoice=sc.nextLine().trim().toLowerCase();
		switch(companyChoice) {
			case "whatsapp":
				Whatsapp w=new Whatsapp();
				System.out.println("welcome to whatsapp family");
				w.info();
				w.login(userName);
				w.privacyPolicy();
				w.specialFeature();
				break;
			case "instagram":
				Instagram i=new Instagram();
				System.out.println("welcome to instagram family");
				i.info();
				i.login(userName);
				i.privacyPolicy();
				i.specialFeature();
				break;
			default:
				System.out.println("Invalid Choice");
		}

	}

}
