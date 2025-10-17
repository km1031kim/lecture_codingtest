package complex_1;

import java.util.Scanner;

public class Main {

    public void solution(int N, int M, int[] arr) {

        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < N; rt++) {

            // rt가 증가하면서 lt가 쫒아오면 된다.

            // 더했을때 크다면 lt를 빼고
            // 더했을때 작다면 rt를 더한다.
            // 증가하고 더하고 확인
            sum += arr[rt];
            if (sum == M) {
                answer++;
            }

            while (sum >= M) {
                sum -= arr[lt];
                lt++;
                if (sum == M) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(N, M, array);
    }
}
