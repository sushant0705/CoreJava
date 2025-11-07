package mehodsinjava;

public class DefaultConstructor 
{
	int id;
	String name;
	String city;
	void display() {
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String[] args)
	{
		DefaultConstructor d=new DefaultConstructor();
		d.display();

	}

}
