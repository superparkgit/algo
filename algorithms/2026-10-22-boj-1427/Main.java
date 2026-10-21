import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] digits = reader.readLine().toCharArray();
        Arrays.sort(digits);
        StringBuilder output = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            output.append(digits[i]);
        }
        System.out.println(output);
    }
}
