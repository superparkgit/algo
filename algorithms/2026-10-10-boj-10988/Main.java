import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int left = 0, right = word.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(palindrome ? 1 : 0);
    }
}
