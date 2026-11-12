import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(reader.readLine());
        int size = Integer.parseInt(input.nextToken());
        int step = Integer.parseInt(input.nextToken());

        Deque<Integer> people = new ArrayDeque<>();
        for (int number = 1; number <= size; number++) {
            people.addLast(number);
        }

        StringJoiner order = new StringJoiner(", ", "<", ">");
        while (!people.isEmpty()) {
            int rotations = (step - 1) % people.size();
            for (int index = 0; index < rotations; index++) {
                people.addLast(people.removeFirst());
            }
            order.add(Integer.toString(people.removeFirst()));
        }
        System.out.println(order);
    }
}
