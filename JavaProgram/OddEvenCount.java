package JavaProgram;

public class OddEvenCount {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;

        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;   
            } else {
                oddCount++;    
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
