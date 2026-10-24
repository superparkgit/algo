import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer tokens;

    private static int nextInt() throws Exception {
        while (tokens == null || !tokens.hasMoreTokens()) {
            tokens = new StringTokenizer(READER.readLine());
        }
        return Integer.parseInt(tokens.nextToken());
    }

    public static void main(String[] args) throws Exception {
        int count = nextInt();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < count; i++) {
            int card = nextInt();
            frequency.put(card, frequency.getOrDefault(card, 0) + 1);
        }
        int queryCount = nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < queryCount; i++) {
            if (i > 0) {
                output.append(' ');
            }
            output.append(frequency.getOrDefault(nextInt(), 0));
        }
        System.out.println(output);
    }
}
