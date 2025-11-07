package mehodsinjava;

public class ParameterizedConstructor {
	//Default ParameterizedConstructor
	public ParameterizedConstructor() {
		System.out.println("Default constuctor");
	}
	//parameterized ParameterizedConstructor
	public ParameterizedConstructor(int a) {
		System.out.println("parameterized constuctor");
	}
	public ParameterizedConstructor(int a,int b) {
		System.out.println("2 para constuctor");
	}

	public static void main(String[] args) {
		ParameterizedConstructor p1=new ParameterizedConstructor(10,20);
		

	}

}
