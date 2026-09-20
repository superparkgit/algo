class Solution {
    public int solution(int n) {
        int quotient = n / 7;
        int remainder = n % 7;

        if (remainder == 0) {
            return quotient;
        } else {
            return quotient + 1;
        }
    }
}
