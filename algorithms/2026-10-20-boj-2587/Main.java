import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(sum / numbers.length);
        System.out.println(numbers[numbers.length / 2]);
    }
}
