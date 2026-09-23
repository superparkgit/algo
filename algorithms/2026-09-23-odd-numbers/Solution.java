class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int index = 0;

        for (int number = 1; number <= n; number++) {
            if (number % 2 == 1) {
                answer[index] = number;
                index++;
            }
        }

        return answer;
    }
}
