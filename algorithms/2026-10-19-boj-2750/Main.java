import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers);
        StringBuilder output = new StringBuilder();
        for (int number : numbers) {
            output.append(number).append('\n');
        }
        System.out.print(output);
    }
}
