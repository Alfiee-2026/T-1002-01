package Q4;
import java.util.Random;
import java.util.Scanner;

public class Dicegame {
    public static void main(String[] args){
        Random dice = new Random(7);
        Scanner cek = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name1 = cek.nextLine();
        int number1 = dice.nextInt(7);
        System.out.println("Enter your name :");
        String name2 = cek.nextLine();
        int number2 = dice.nextInt(7);
        if(number1 > number2){
            System.out.println(name1 + " " + number1 + " " + name2 + " " + number2);
            System.out.println(name1 + " " + number1 + " "+ "is the winner");
        }
        else if(number1 < number2){
            System.out.println(name1 + " " + number1 + " " + name2 + " " + number2);
            System.out.println(name2 + " " + number2 + " "+ "is the winner");
        }
        else{
            System.out.println("Draw");
        }
    }
}
