package array_4;

import java.util.Scanner;

public class Answer {

    public int[] solution(int n) {
        int[] answer = new int[n];

        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        Answer answer = new Answer();
        answer.solution(input);
    }
}
