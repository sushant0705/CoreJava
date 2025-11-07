package mehodsinjava;
import java.util.*;
public class Multiplication {
	public void MultiplicationTable() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for the multiplication table : ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int result=num*i;
			System.out.println(num + "*" + i + "=" + result);
		}
		
	}

	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		m.MultiplicationTable();
		
		

	}

}
