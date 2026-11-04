package Q3;
import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        Scanner cek = new Scanner(System.in);
        System.out.println("Enter your scre:");
        int score = cek.nextInt();
        if(score < 40){
            System.out.println("You are failed");
        }
        else{
            System.out.println("You are passed");
        }
        
    }
    
}
