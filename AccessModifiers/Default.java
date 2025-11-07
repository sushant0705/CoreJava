package AccessModifiers;

public class Default {
	void showDetails() {
		System.out.println("hi everyone");
	}
	public static void main(String[] args) {
		//we can access default  fields,method and constructor within same package;

		Default d=new Default();
		d.showDetails();
		
		
	}

}
