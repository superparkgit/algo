import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer conditionTokenizer = new StringTokenizer(reader.readLine());

        int numberCount = Integer.parseInt(conditionTokenizer.nextToken());
        int limit = Integer.parseInt(conditionTokenizer.nextToken());
        StringTokenizer numberTokenizer = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < numberCount; index++) {
            int number = Integer.parseInt(numberTokenizer.nextToken());

            if (number < limit) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(number);
            }
        }

        System.out.println(result);
    }
}
