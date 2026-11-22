import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int bestRow = 1;
        int bestColumn = 1;
        for (int row = 1; row <= 9; row++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            for (int column = 1; column <= 9; column++) {
                int value = Integer.parseInt(tokens.nextToken());
                if (value > maximum) {
                    maximum = value;
                    bestRow = row;
                    bestColumn = column;
                }
            }
        }
        System.out.println(maximum);
        System.out.println(bestRow + " " + bestColumn);
    }
}
