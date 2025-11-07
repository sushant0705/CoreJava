package JavaProgram;

public class Parent {
	void money(double amount) {
		System.out.println("Parent Has $"+amount);
	}
}
class Son extends Parent{
	void money(double amount2) {
		super.money(amount2);
		System.out.println("Parent Has $"+amount2);
	}
}

