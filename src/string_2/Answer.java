package string_2;

import string_1.Main;

import java.util.Scanner;

public class Answer {

    public String solution(String str) {

        // 97 ~ 122 사이면 소문자임. 32 빼면 대문자. 이 방법으로 풀어도 된다.
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Scanner sc = new Scanner(System.in);
        String solution = answer.solution(sc.next());
        System.out.println("solution = " + solution);
    }
}
