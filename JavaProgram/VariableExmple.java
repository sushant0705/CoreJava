package JavaProgram;

public class VariableExmple {
	String name="sushant";
	static String bankName="SBI";
	void Account() {
		double balance=10000.20;//local variable
		System.out.println("your name is = "+name);
		System.out.println("your bank name is = "+bankName);
		System.out.println("your balane is = "+balance);
	}
	public static void main(String[] args) {
		
		VariableExmple s=new VariableExmple();
		s.Account();
	}

}

