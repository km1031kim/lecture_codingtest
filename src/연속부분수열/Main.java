package 연속부분수열;

import java.util.Scanner;

public class Main {


    public void solution(int N, int K, int[] array) {

        // K가 되는 경우의 수

        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < array.length; rt++) {

            // 더하고 판단한다
            sum += array[rt];

            if (sum == K) {
                answer++;
            }

            while (sum >= K) {
                sum -= array[lt];
                lt++;

                if (sum == K) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        String[] input = sc.nextLine().split(" ");
        int[] array = new int[N];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        Main main = new Main();
        main.solution(N, K, array);
    }

}
