package sort_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 선택 정렬
 */
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            int i1 = sc.nextInt();
            input[i] = i1;
        }

        for (int i = 0; i < N - 1; i++) {
            int index = i;
            for (int j = i + 1; j < N; j++) {
                if (input[index] > input[j]) {
                    index = j;
                }
            }
            int tmp = input[index];
            input[index] = input[i];
            input[i] = tmp;
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
