import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            String command = tokens.nextToken();
            Integer result;
            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(tokens.nextToken()));
                    continue;
                case "push_back":
                    deque.addLast(Integer.parseInt(tokens.nextToken()));
                    continue;
                case "pop_front": result = deque.pollFirst(); break;
                case "pop_back": result = deque.pollLast(); break;
                case "front": result = deque.peekFirst(); break;
                case "back": result = deque.peekLast(); break;
                case "size": result = deque.size(); break;
                case "empty": result = deque.isEmpty() ? 1 : 0; break;
                default: throw new IllegalArgumentException(command);
            }
            output.append(result == null ? -1 : result).append('\n');
        }
        System.out.print(output);
    }
}
