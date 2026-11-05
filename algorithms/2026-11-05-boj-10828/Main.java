import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            String command = tokens.nextToken();
            if (command.equals("push")) {
                stack.push(Integer.parseInt(tokens.nextToken()));
                continue;
            }
            int result;
            switch (command) {
                case "pop": result = stack.isEmpty() ? -1 : stack.pop(); break;
                case "top": result = stack.isEmpty() ? -1 : stack.peek(); break;
                case "size": result = stack.size(); break;
                case "empty": result = stack.isEmpty() ? 1 : 0; break;
                default: throw new IllegalArgumentException(command);
            }
            output.append(result).append('\n');
        }
        System.out.print(output);
    }
}
