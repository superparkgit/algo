import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(tokens.nextToken());
        int target = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int number : numbers) {
            if (number == target) count++;
        }
        System.out.println(count);
    }
}
