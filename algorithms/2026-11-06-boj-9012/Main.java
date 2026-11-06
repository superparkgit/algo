import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isBalanced(String line) {
        int open = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                open++;
            } else if (--open < 0) {
                return false;
            }
        }
        return open == 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            output.append(isBalanced(reader.readLine()) ? "YES" : "NO").append('\n');
        }
        System.out.print(output);
    }
}
