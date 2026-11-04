package Q2;
import java.util.Random;

public class DetermineNumber{
    public static void main(String[]args){
        Random num = new Random();
        int number = num.nextInt(101);
        if(number < 50){
            System.out.println(number + " " + "Less than 50");
        }
        else if(number == 50){
            System.out.println(number + " " + "Equal to 50");
        }
        else{
            System.out.println(number + " " + "Greater than 50");
        }
    }
}