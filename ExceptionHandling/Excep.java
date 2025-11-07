package ExceptionHandling;

public class Excep {

	public static void main(String[] args) {
	    try {
	        int a=10,b=0;     
	        int c=a/b;     
	        System.out.println(c);
	    }
	    //this is correct
//	    catch(ArithmeticException e) {
//    	System.out.println("Exception caught arithmetic "); 
//	    }
	    catch (Exception e) {
		       System.out.println("Exception caught main");      
		}
	    //this is wrong
	    //give compilation error
//	    catch(ArithmeticException e) {
//	    	System.out.println("Exception caught "); 
//	    }
	   
	    System.out.println("hello");
	}

}
