import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer header = new StringTokenizer(reader.readLine());
        int storedCount = Integer.parseInt(header.nextToken());
        int queryCount = Integer.parseInt(header.nextToken());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < storedCount; i++) {
            words.add(reader.readLine());
        }
        int matches = 0;
        for (int i = 0; i < queryCount; i++) {
            if (words.contains(reader.readLine())) {
                matches++;
            }
        }
        System.out.println(matches);
    }
}
