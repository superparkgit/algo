import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int answer = 0;
        for (int wordIndex = 0; wordIndex < count; wordIndex++) {
            String word = reader.readLine();
            boolean[] seen = new boolean[26];
            char previous = 0;
            boolean valid = true;
            for (int index = 0; index < word.length(); index++) {
                char current = word.charAt(index);
                if (current != previous) {
                    if (seen[current - 'a']) {
                        valid = false;
                        break;
                    }
                    seen[current - 'a'] = true;
                    previous = current;
                }
            }
            if (valid) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
