import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int[] counts = new int[26];
        for (int index = 0; index < word.length(); index++) {
            char letter = Character.toUpperCase(word.charAt(index));
            counts[letter - 'A']++;
        }
        int maximum = 0;
        char answer = '?';
        for (int index = 0; index < counts.length; index++) {
            if (counts[index] > maximum) {
                maximum = counts[index];
                answer = (char) ('A' + index);
            } else if (counts[index] == maximum) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
