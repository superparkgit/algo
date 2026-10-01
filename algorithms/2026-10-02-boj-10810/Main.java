import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(reader.readLine());
        int basketCount = Integer.parseInt(firstLine.nextToken());
        int commandCount = Integer.parseInt(firstLine.nextToken());
        int[] baskets = new int[basketCount + 1];

        for (int command = 0; command < commandCount; command++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tokens.nextToken());
            int end = Integer.parseInt(tokens.nextToken());
            int ballNumber = Integer.parseInt(tokens.nextToken());

            for (int basket = start; basket <= end; basket++) {
                baskets[basket] = ballNumber;
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
