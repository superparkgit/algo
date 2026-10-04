import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(reader.readLine());
        int basketCount = Integer.parseInt(firstLine.nextToken());
        int swapCount = Integer.parseInt(firstLine.nextToken());
        int[] baskets = new int[basketCount + 1];

        for (int basket = 1; basket <= basketCount; basket++) {
            baskets[basket] = basket;
        }

        for (int swap = 0; swap < swapCount; swap++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int first = Integer.parseInt(tokens.nextToken());
            int second = Integer.parseInt(tokens.nextToken());

            int temporary = baskets[first];
            baskets[first] = baskets[second];
            baskets[second] = temporary;
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
