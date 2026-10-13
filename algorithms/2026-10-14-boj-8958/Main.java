import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        for (int test = 0; test < testCount; test++) {
            String answers = reader.readLine();
            int streak = 0;
            int total = 0;
            for (int i = 0; i < answers.length(); i++) {
                if (answers.charAt(i) == 'O') {
                    streak++;
                    total += streak;
                } else {
                    streak = 0;
                }
            }
            output.append(total).append('\n');
        }
        System.out.print(output);
    }
}
