package AccessModifiers;
//protected members available in same package as well as different package using inheritance
public class Protected {
	protected void display() {
		System.out.println("sushant");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected pd=new Protected();
		pd.display();

	}

}
