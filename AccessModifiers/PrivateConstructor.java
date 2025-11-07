package AccessModifiers;
//we can access only in same class
//we cannot create outer class as a private
public class PrivateConstructor {
	//we can create variable,method and constructor as a private
	private int id=1;
	private void show() {
		System.out.println("hi");
		 //local variable is not a private
		 //private int age =20;
	}
	private PrivateConstructor() {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		PrivateConstructor p=new PrivateConstructor();
		p.show();
		System.out.println(p.id);
		//we can access default  fields,method and constructor within same package;
		Default d=new Default();
		d.showDetails();

	}

}
