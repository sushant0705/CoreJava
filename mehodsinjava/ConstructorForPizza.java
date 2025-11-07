package mehodsinjava;

import java.util.Scanner;

public class ConstructorForPizza {
	public ConstructorForPizza() {
		System.out.println("you order simple pizza");
		System.out.println("you call default constructor");
	}
	public ConstructorForPizza(String name) {
		System.out.println("you order "+name+" pizza");
		System.out.println("you call constructor with single parameter");
	}
	public ConstructorForPizza(String name,String cheez) {
		System.out.println("you order "+name+" pizza with "+cheez+" cheez");
		System.out.println("you call constructor with double parameter");
	}
	

	public static void main(String[] args) {
		ConstructorForPizza pizza1=new ConstructorForPizza();
		Scanner sc=new Scanner(System.in);
		int ch;
		String name;
		do {
			System.out.println();
			System.out.println();
			System.out.println("if you want to check which paramete is working enter \n1:Parameterize constructor with one parameter \n2:Parameterize constructor with two parameter");
			System.out.println("enter you choice:");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1:
				System.out.println("enter the name of the pizza");
				name=sc.nextLine();
				ConstructorForPizza pizza2=new ConstructorForPizza(name);
				break;
			case 2:
				System.out.println("enter the name of pizza");
				name=sc.nextLine();
				System.out.println("you want to extra cheez or not");
				String cheez=sc.nextLine();
				ConstructorForPizza pizza3=new ConstructorForPizza(name,cheez);
				break;
			default:
				System.out.println("invalid");
			
			}
		}while(ch<3);
		
	}

}
