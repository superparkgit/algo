import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> cards = new ArrayDeque<>();
        for (int number = 1; number <= count; number++) {
            cards.addLast(number);
        }
        while (cards.size() > 1) {
            cards.removeFirst();
            cards.addLast(cards.removeFirst());
        }
        System.out.println(cards.removeFirst());
    }
}
