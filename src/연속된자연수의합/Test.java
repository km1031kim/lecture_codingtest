package 연속된자연수의합;

import java.util.Scanner;

public class Test {

    public void solution(int N) {

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        int lt = 0;
        int sum = 0;
        int answer = 0;
        int length = N/2 + 1;

        for (int rt = 0; rt < length; rt++) {
            sum += array[rt];

            if (sum == N) {
                answer++;
            }

            while (sum >= N) {
                sum -= array[lt];
                lt--;

                if (sum == N) {
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Main main = new Main();
        main.solution(N);
    }
}
