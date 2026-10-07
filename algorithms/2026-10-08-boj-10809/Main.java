import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int[] first = new int[26];
        Arrays.fill(first, -1);
        for (int i = 0; i < word.length(); i++) {
            int letter = word.charAt(i) - 'a';
            if (first[letter] == -1) {
                first[letter] = i;
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (i > 0) output.append(' ');
            output.append(first[i]);
        }
        System.out.println(output);
    }
}
