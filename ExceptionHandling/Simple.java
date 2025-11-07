package ExceptionHandling;

public class Simple {

	public static void main(String[] args) {
		System.out.println("Pune");
		System.out.println("Lonavala");
		System.out.println("Khandala");
		//handle exception
		try {
			int a=10/0;
		}catch(ArithmeticException e){
			System.out.println("Puncture repair");
		}
		
		System.out.println("Kalyan");
		System.out.println("Mumbai");

	}

}
