package InheritanceInJava;

public class MetaAppUsingHirachicalInheritance {
	void info() {
		System.out.println("Welcome from meta team");
	}
	void login(String userName) {
		System.out.println("User"+ userName +"welcome in meta family");
	}
	void privacyPolicy() {
		System.out.println("All rights reserved by meta");
	}

}
class Whatsapp extends MetaAppUsingHirachicalInheritance{
	void specialFeature() {
		System.out.println("Secure message, calling and payment");
	}
}
class Instagram extends MetaAppUsingHirachicalInheritance{
	void specialFeature() {
		System.out.println("Secure phota and video sharingsss");
	}
}

