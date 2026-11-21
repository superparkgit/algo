import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int rows = Integer.parseInt(tokens.nextToken());
        int columns = Integer.parseInt(tokens.nextToken());
        int[][] sums = new int[rows][columns];
        for (int matrix = 0; matrix < 2; matrix++) {
            for (int row = 0; row < rows; row++) {
                tokens = new StringTokenizer(reader.readLine());
                for (int column = 0; column < columns; column++) {
                    sums[row][column] += Integer.parseInt(tokens.nextToken());
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for (int[] row : sums) {
            for (int column = 0; column < columns; column++) {
                if (column > 0) {
                    output.append(' ');
                }
                output.append(row[column]);
            }
            output.append('\n');
        }
        System.out.print(output);
    }
}
