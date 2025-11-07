package AccessModifiers;
import java.util.*;
public class AccessModifiersInJava {
//	Scanner sc=new Scanner(System.in);
//	String name=sc.nextLine();
	private void showPrivate() {
		System.out.println("this is private access modifiers");
	}
	void showDefault(){
		System.out.println("this is default access modifiers");
	}
	protected void showProtected() {
		System.out.println("this is protected aceess modifiers");
	}
	
	

	public static void main(String[] args) {
		AccessModifiersInJava ac=new AccessModifiersInJava();
		ac.showPrivate();
		
		
	}

}
