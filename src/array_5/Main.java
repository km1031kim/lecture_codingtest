package array_5;

import java.util.Scanner;

/**
 * 소수 구하기 : 에라토스테네스의 체
 */
public class Main {

    public void solution(int input) {
        int[] array = new int[input + 1];

        /**
         * 0, 1은 안해도 됨 어차피 소수는 2부터다
         */
        int count = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] == 0) {
                count++;

                // 배수 체크
                for (int j = i; j < array.length; j=j+i) {
                    array[j]++;
                }
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        /**
         * n + 1 개 만큼 배열 생성
         * array[i] == 0 이면 소수. 해당 수의 배수들은 모두 ++
         */


        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Main main = new Main();
        main.solution(input);

    }
}
