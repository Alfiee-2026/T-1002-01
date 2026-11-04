package Q9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class KeywordFrequency {
    public static void main(String[] args) throws Exception {
        Scanner cek = new Scanner(System.in);
        System.out.println("Enter the URL address:");
        String address = cek.nextLine();
        System.out.println("Enter the keyword to search:");
        String keyword = cek.nextLine().toLowerCase();

        URL url = new URL(address);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream()));

        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.toLowerCase().split(" ");
            for (String word : words) {
                if (word.contains(keyword)) {
                    count++;
                }
            }
        }
        reader.close();

        System.out.println("Keyword \"" + keyword + "\" has appeared " + count + " times");
    }
}