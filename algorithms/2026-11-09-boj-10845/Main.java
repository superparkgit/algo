import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            String command = tokens.nextToken();
            if (command.equals("push")) {
                queue.addLast(Integer.parseInt(tokens.nextToken()));
                continue;
            }
            int result;
            switch (command) {
                case "pop": result = queue.isEmpty() ? -1 : queue.removeFirst(); break;
                case "front": result = queue.isEmpty() ? -1 : queue.peekFirst(); break;
                case "back": result = queue.isEmpty() ? -1 : queue.peekLast(); break;
                case "size": result = queue.size(); break;
                case "empty": result = queue.isEmpty() ? 1 : 0; break;
                default: throw new IllegalArgumentException(command);
            }
            output.append(result).append('\n');
        }
        System.out.print(output);
    }
}
