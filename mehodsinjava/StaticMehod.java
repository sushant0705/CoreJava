package mehodsinjava;

public class StaticMehod {
	
	static int sum=50;

	static void onStart() {
		System.out.println("Game is Start");
	}
	static void onStop() {
		System.out.println("Game is Stop");
	}

	public static void main(String[] args) {
		
		StaticMehod.onStart();
		StaticMehod.onStop();
		//System.out.println(StaticMehod.sum);
		
	}


}
