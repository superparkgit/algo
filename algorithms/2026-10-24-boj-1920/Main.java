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

    public static void main(String[] args) throws Exception {
        int count = nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = nextInt();
        }
        Arrays.sort(numbers);
        int queryCount = nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < queryCount; i++) {
            int target = nextInt();
            output.append(Arrays.binarySearch(numbers, target) >= 0 ? 1 : 0).append('\n');
        }
        System.out.print(output);
    }
}
