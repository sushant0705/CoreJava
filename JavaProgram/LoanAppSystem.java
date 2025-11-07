package JavaProgram;

import java.util.Scanner;
class Personp {
    private String name;
    private int age;

    public Personp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
    	return name; 
    }
    public int getAge() { 
    	return age; 
    	}
}

class LoanApplicant extends Personp {
    private int creditScore;

    public LoanApplicant(String name, int age, int creditScore) {
        super(name, age);
        this.creditScore = creditScore;
    }
    public void diplayInfo() {
    	System.out.println("Welcome "+super.getName());
    }
    public void applyForLoan() throws LowCreditScoreException {
    	
        if (creditScore < 650) {
            throw new LowCreditScoreException("Exception Caught: Loan Denied Credit score too low!");
        } else {
            System.out.println("Loan Approved for " + getName());
        }
    }
}

public class LoanAppSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Welcome to loan application system========");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();
        sc.nextLine();

        LoanApplicant a = new LoanApplicant(name, age, creditScore);

        try {
        	a.diplayInfo();
            a.applyForLoan();
        } catch (LowCreditScoreException e) {
            System.out.println( e.getMessage());
        }
        finally {
        	System.out.println("========Thank you for visiting "+a.getName()+"========");
        }

        sc.close();
    }
}

