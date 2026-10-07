import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();

        for (int testCase = 0; testCase < testCaseCount; testCase++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int repeatCount = Integer.parseInt(tokens.nextToken());
            String text = tokens.nextToken();

            for (int index = 0; index < text.length(); index++) {
                char character = text.charAt(index);
                for (int repeat = 0; repeat < repeatCount; repeat++) {
                    output.append(character);
                }
            }
            output.append('\n');
        }

        System.out.print(output);
    }
}
