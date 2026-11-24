import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        boolean[][] covered = new boolean[100][100];
        int area = 0;
        for (int paper = 0; paper < count; paper++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int left = Integer.parseInt(tokens.nextToken());
            int bottom = Integer.parseInt(tokens.nextToken());
            for (int x = left; x < left + 10; x++) {
                for (int y = bottom; y < bottom + 10; y++) {
                    if (!covered[x][y]) {
                        covered[x][y] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
