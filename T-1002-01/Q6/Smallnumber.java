package Q6;
import java.util.Random;

public class Smallnumber {
    public static void main(String[] args){
        
        Random num = new Random();
        int[] number = new int[11];
        
        for(int i = 0; i <= 10; i++){
            number[i] = num.nextInt(100);
            System.out.print(number[i] + " ");
        }
        int smallest = number[0];

        for(int i = 1; i < number.length; i++){
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
    }
    
}
