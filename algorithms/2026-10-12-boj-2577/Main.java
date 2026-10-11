import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        String product = Integer.toString(a * b * c);
        int[] frequency = new int[10];
        for (int i = 0; i < product.length(); i++) {
            frequency[product.charAt(i) - '0']++;
        }
        StringBuilder output = new StringBuilder();
        for (int count : frequency) output.append(count).append('\n');
        System.out.print(output);
    }
}
