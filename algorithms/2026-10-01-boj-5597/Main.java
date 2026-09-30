import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(reader.readLine());
            submitted[studentNumber] = true;
        }

        for (int studentNumber = 1; studentNumber <= 30; studentNumber++) {
            if (!submitted[studentNumber]) {
                System.out.println(studentNumber);
            }
        }
    }
}
