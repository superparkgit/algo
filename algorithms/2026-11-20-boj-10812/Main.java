import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int size = Integer.parseInt(tokens.nextToken());
        int operations = Integer.parseInt(tokens.nextToken());
        int[] baskets = new int[size];
        for (int index = 0; index < size; index++) {
            baskets[index] = index + 1;
        }
        for (int operation = 0; operation < operations; operation++) {
            tokens = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tokens.nextToken()) - 1;
            int end = Integer.parseInt(tokens.nextToken()) - 1;
            int middle = Integer.parseInt(tokens.nextToken()) - 1;
            int[] rotated = new int[end - start + 1];
            int target = 0;
            for (int index = middle; index <= end; index++) {
                rotated[target++] = baskets[index];
            }
            for (int index = start; index < middle; index++) {
                rotated[target++] = baskets[index];
            }
            System.arraycopy(rotated, 0, baskets, start, rotated.length);
        }
        StringBuilder output = new StringBuilder();
        for (int value : baskets) {
            if (output.length() > 0) {
                output.append(' ');
            }
            output.append(value);
        }
        System.out.println(output);
    }
}
