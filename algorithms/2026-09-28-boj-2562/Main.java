import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int NUMBER_COUNT = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int maximumPosition = 0;

        for (int position = 1; position <= NUMBER_COUNT; position++) {
            int number = Integer.parseInt(reader.readLine());

            if (number > maximum) {
                maximum = number;
                maximumPosition = position;
            }
        }

        System.out.println(maximum);
        System.out.println(maximumPosition);
    }
}
