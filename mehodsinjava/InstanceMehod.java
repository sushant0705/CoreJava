package mehodsinjava;

public record InstanceMehod() {
	void onStart() {
		System.out.println("Game is Start");
	}
	void onStop() {
		System.out.println("Game is Stop");
	}

	public static void main(String[] args) {
		
		InstanceMehod i=new InstanceMehod();
		i.onStart();
		i.onStop();
	}

}
