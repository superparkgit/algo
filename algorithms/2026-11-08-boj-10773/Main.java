import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        long sum = 0;
        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(reader.readLine());
            if (value == 0) {
                sum -= stack.pop();
            } else {
                stack.push(value);
                sum += value;
            }
        }
        System.out.println(sum);
    }
}
