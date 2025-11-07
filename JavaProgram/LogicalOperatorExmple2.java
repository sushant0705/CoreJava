package JavaProgram;

public class LogicalOperatorExmple2 {
	void display() {
		String name="sushant";
		int password=1234;
		if(name=="sushant" && password==1234) {
			System.out.println("login successfully");
		}
		else {
			System.out.println("login denied");
		}
	}

	public static void main(String[] args) {
		LogicalOperatorExmple2 d= new LogicalOperatorExmple2();
		d.display();
		
	}

}
