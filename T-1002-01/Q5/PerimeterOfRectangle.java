package Q5;
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        Scanner cekk = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = cekk.nextInt();
        System.out.println("Enter the width :");
        int width = cekk.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle is :" + perimeter);


    }
    
}
