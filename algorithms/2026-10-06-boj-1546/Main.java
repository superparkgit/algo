import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = Integer.parseInt(reader.readLine());
        StringTokenizer scores = new StringTokenizer(reader.readLine());

        double sum = 0;
        int maximum = 0;

        for (int subject = 0; subject < subjectCount; subject++) {
            int score = Integer.parseInt(scores.nextToken());
            sum += score;
            maximum = Math.max(maximum, score);
        }

        double adjustedAverage = sum / maximum * 100 / subjectCount;
        System.out.println(adjustedAverage);
    }
}
