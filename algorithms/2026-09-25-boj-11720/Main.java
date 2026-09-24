import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int digitCount = Integer.parseInt(reader.readLine());
        String digits = reader.readLine();
        int sum = 0;

        for (int index = 0; index < digitCount; index++) {
            sum += digits.charAt(index) - '0';
        }

        System.out.println(sum);
    }
}
