package Q11;
import java.util.Random;

public class DescendingSort {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] numbers = new int[5];
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            numbers[i] = ran.nextInt(100); 
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    
}
