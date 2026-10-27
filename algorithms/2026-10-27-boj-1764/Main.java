import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer header = new StringTokenizer(reader.readLine());
        int firstCount = Integer.parseInt(header.nextToken());
        int secondCount = Integer.parseInt(header.nextToken());
        Set<String> first = new HashSet<>();
        for (int i = 0; i < firstCount; i++) {
            first.add(reader.readLine());
        }
        List<String> common = new ArrayList<>();
        for (int i = 0; i < secondCount; i++) {
            String name = reader.readLine();
            if (first.contains(name)) {
                common.add(name);
            }
        }
        Collections.sort(common);
        StringBuilder output = new StringBuilder();
        output.append(common.size()).append('\n');
        for (String name : common) {
            output.append(name).append('\n');
        }
        System.out.print(output);
    }
}
