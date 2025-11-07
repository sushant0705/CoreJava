package mehodsinjava;

public class CopyConstructor {
	int id;
	int age;
	CopyConstructor(int i,int a){
		id=i;
		age=a;
	}
	CopyConstructor(CopyConstructor c){
		id=c.id;
		age=c.age;
		
	}
	void display() {
		System.out.println(id);
		System.out.println(age);
	}
		
	

	public static void main(String[] args) {
		CopyConstructor c1=new CopyConstructor(07,21);
		c1.display();
		
		CopyConstructor c2=new CopyConstructor(c1);
		c2.display();

	}

}
