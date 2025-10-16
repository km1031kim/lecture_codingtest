package array_7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void solution(int[] array) {

        int[] score = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                continue;
            }

            // i== 0이면 그냥 점수 확인 후 패스
            if (i == 0) {
                if (array[i] == 1) {
                    score[i] = 1;
                }
                continue;
            }

            // 정답인 경우
            score[i] = 1 + score[i - 1];
        }

        int sum = Arrays.stream(score).filter(i -> i > 0).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(array);
    }
}
