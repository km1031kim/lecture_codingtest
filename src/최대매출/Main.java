package 최대매출;

import java.util.Scanner;

public class Main {

    public void solution(int N, int K, int[] array) {



        int sum = 0;

        for (int i = 0; i < array.length - K + 1; i++) {
            int tmp = 0;
            for (int j = i; j < i + K; j++) {
                tmp += array[j];
            }

            sum = Math.max(sum, tmp);
        }

        System.out.println(sum);
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
