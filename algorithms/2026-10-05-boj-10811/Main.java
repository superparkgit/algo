import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(reader.readLine());
        int basketCount = Integer.parseInt(firstLine.nextToken());
        int reverseCount = Integer.parseInt(firstLine.nextToken());
        int[] baskets = new int[basketCount + 1];

        for (int basket = 1; basket <= basketCount; basket++) {
            baskets[basket] = basket;
        }

        for (int command = 0; command < reverseCount; command++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int left = Integer.parseInt(tokens.nextToken());
            int right = Integer.parseInt(tokens.nextToken());

            while (left < right) {
                int temporary = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = temporary;
                left++;
                right--;
            }
        }

        StringBuilder output = new StringBuilder();
        for (int basket = 1; basket <= basketCount; basket++) {
            if (basket > 1) {
                output.append(' ');
            }
            output.append(baskets[basket]);
        }

        System.out.println(output);
    }
}
