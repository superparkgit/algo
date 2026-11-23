import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rows = new String[5];
        int maxLength = 0;
        for (int row = 0; row < rows.length; row++) {
            rows[row] = reader.readLine();
            maxLength = Math.max(maxLength, rows[row].length());
        }
        StringBuilder output = new StringBuilder();
        for (int column = 0; column < maxLength; column++) {
            for (String row : rows) {
                if (column < row.length()) {
                    output.append(row.charAt(column));
                }
            }
        }
        System.out.println(output);
    }
}
