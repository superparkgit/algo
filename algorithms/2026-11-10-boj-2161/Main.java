import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> cards = new ArrayDeque<>();
        for (int number = 1; number <= count; number++) {
            cards.addLast(number);
        }
        StringBuilder output = new StringBuilder();
        while (!cards.isEmpty()) {
            if (output.length() > 0) {
                output.append(' ');
            }
            output.append(cards.removeFirst());
            // 마지막 카드를 버린 뒤에는 이동할 카드가 없다.
            if (!cards.isEmpty()) {
                cards.addLast(cards.removeFirst());
            }
        }
        System.out.println(output);
    }
}
