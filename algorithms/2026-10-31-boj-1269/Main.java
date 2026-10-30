import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
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
        int firstCount = nextInt();
        int secondCount = nextInt();
        Set<Integer> first = new HashSet<>();
        for (int i = 0; i < firstCount; i++) {
            first.add(nextInt());
        }
        int commonCount = 0;
        for (int i = 0; i < secondCount; i++) {
            if (first.contains(nextInt())) {
                commonCount++;
            }
        }
        System.out.println(firstCount + secondCount - 2 * commonCount);
    }
}
