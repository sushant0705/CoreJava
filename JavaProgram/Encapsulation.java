package JavaProgram;

public class Encapsulation 
{
	private String name;
	private int age;
	private String mobileNo;
	
	private void display() {
		System.out.println(name + age + mobileNo);
	}
	public void show() {
		display();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public static void main(String[] args) 
	{
		
	}

}
