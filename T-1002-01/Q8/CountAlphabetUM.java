package Q8;
import java.util.Scanner;

public class CountAlphabetUM {
    public static void main(String[] args){
        char cariHurufU = 'U';
        char cariHurufu = 'u';
        char cariHurufM = 'M';
        char cariHurufm = 'm';
        int HurufU = 0;
        int HurufM = 0;
        Scanner cek = new Scanner(System.in);
        System.out.println("Enter your words");
        String words = cek.nextLine();

        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) == cariHurufU || words.charAt(i) == cariHurufu){
                HurufU++;
            } else if(words.charAt(i) == cariHurufM || words.charAt(i) == cariHurufm){
                HurufM++;
            }
        }
        System.out.println("The number of U is : " + HurufU);
        System.out.println("The number of M is : " + HurufM);
    }
    
}
