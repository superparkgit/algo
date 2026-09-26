import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberCount = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int index = 0; index < numberCount; index++) {
            int number = Integer.parseInt(tokenizer.nextToken());
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        System.out.println(minimum + " " + maximum);
    }
}
