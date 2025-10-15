package string_6;

import java.util.Scanner;

public class Answer {


    // indexOf 활용
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(answer.solution(s));
    }
}
