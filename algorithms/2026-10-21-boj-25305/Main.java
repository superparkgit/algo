import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer header = new StringTokenizer(reader.readLine());
        int count = Integer.parseInt(header.nextToken());
        int rank = Integer.parseInt(header.nextToken());
        int[] scores = new int[count];
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < count; i++) {
            scores[i] = Integer.parseInt(tokens.nextToken());
        }
        Arrays.sort(scores);
        System.out.println(scores[count - rank]);
    }
}
