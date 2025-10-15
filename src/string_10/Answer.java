package string_10;

import java.util.Scanner;

public class Answer {

    // 왼쪽 e부터의 거리, 오른쪽 e부터의 거리를 비교하면 두번의 반복으로 해결할 수 있다.
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char c = scanner.next().charAt(0);

        for (int x : answer.solution(next, c)) {
            System.out.print(x + " ");
        }
    }
}
