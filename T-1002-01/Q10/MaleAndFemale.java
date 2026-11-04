package Q10;
import java.util.Random;

public class MaleAndFemale {
    public static void main(String[]args){
        Random ran = new Random();
        int maleCount = 0;
        int femaleCount = 0;
        for(int i = 0; i <= 99; i++){
            if(ran.nextInt(2) == 0){
                System.out.println("Male");
                maleCount++;
            } else {
                System.out.println("Female");
                femaleCount++;
            }
        }
        System.out.println("Male: " + maleCount);
        System.out.println("Female: " + femaleCount);
    }
    
}
