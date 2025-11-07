package ExceptionHandling;

public class ClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj=new String("HI SUSHANT");
//		Integer num=(Integer)obj;
		
		Integer num = 100;        
        Object obj = num;          

        System.out.println("Object value: " + obj);

	}

}
