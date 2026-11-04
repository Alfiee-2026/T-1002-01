package Q7;
import java.util.Random;

public class EvenAndOdd {
    public static void main(String[] args){
        int[] number = new int[11];
        for(int i=0; i<=10; i++){
            Random num = new Random();
            number[i] = num.nextInt(100);
            System.out.print(number[i] + " ");  
            if(number[i] % 2 == 0){
                System.out.println("Even number : " + number[i]);
            } else {
                System.out.println("Odd number : " + number[i]);
            }
        }

    }
    
}
