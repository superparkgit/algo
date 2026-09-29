import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] seen = new boolean[42];
        int distinctCount = 0;

        for (int i = 0; i < 10; i++) {
            int remainder = Integer.parseInt(reader.readLine()) % 42;

            if (!seen[remainder]) {
                seen[remainder] = true;
                distinctCount++;
            }
        }

        System.out.println(distinctCount);
    }
}
