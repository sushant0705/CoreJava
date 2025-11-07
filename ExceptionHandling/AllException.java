package ExceptionHandling;

public class AllException {

	public static void main(String[] args) {
		//Arithmetic Exception
		int a=10;
		int b=0;
		int c=a/b;//Exception :java.lang.ArithmeticException: 
		System.out.println(c);
		
		
		//Class Cast Exception
		Object obj=new String("HI SUSHANT");
		Integer num=(Integer)obj;//java.lang.ClassCastException:
		
		//ArrayIndexOutOfBound
		int[] marks= {90,80,70};
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);//java.lang.ArrayIndexOutOfBoundsException:
		
		//StringIndexOutOfBound
		String name="Sushant Shinde";//java.lang.StringIndexOutOfBoundsException:
		System.out.println(name.charAt(25));
		
		//NullPointer
		String name1=null;
		System.out.println(name1);
		

	}

}
