import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        boolean inWord = false;
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }
        System.out.println(count);
    }
}
