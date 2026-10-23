import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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

    private static boolean contains(int[] cards, int target) {
        int left = 0;
        int right = cards.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (cards[middle] == target) {
                return true;
            }
            if (cards[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int count = nextInt();
        int[] cards = new int[count];
        for (int i = 0; i < count; i++) {
            cards[i] = nextInt();
        }
        Arrays.sort(cards);
        int queryCount = nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < queryCount; i++) {
            if (i > 0) {
                output.append(' ');
            }
            output.append(contains(cards, nextInt()) ? 1 : 0);
        }
        System.out.println(output);
    }
}
