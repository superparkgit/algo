import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int first = reverseNumber(tokenizer.nextToken());
        int second = reverseNumber(tokenizer.nextToken());

        System.out.println(Math.max(first, second));
    }

    private static int reverseNumber(String number) {
        String reversed = new StringBuilder(number)
                .reverse()
                .toString();

        return Integer.parseInt(reversed);
    }
}
