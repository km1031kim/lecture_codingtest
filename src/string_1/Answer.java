package string_1;

import java.util.Scanner;

public class Answer {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            if (c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println("solution = " + T.solution(str, c));
    }
}
