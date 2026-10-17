import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        for (int test = 0; test < testCount; test++) {
            String word = reader.readLine();
            output.append(word.charAt(0));
            output.append(word.charAt(word.length() - 1));
            output.append('\n');
        }
        System.out.print(output);
    }
}
