package string_11;

import java.util.Scanner;

public class Answer {

    public String solution(String s) {
        String answer = "";

        s = s + " ";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                // 다를 경우
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String solution = answer.solution(input);
        System.out.println("solution = " + solution);
    }
}
