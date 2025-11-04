package 연속된자연수의합;

import java.util.Scanner;

public class Main {

    public void solution(int input) {

        // 투 포인터임.

        int[] array = new int[input + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int sum = 0;
        int count = 0;
        int lt = 1;
        for (int rt = 1; rt < array.length; rt++) {
            sum += array[rt];

            if (sum >= input) {
                if (sum == input) {
                    // 정답이면?
                    count++;
              //      System.out.println("lt : " + lt + ", rt : " + rt);
                } else {
                    while (lt < rt) {
                        sum -= array[lt];
                        lt++;

                        if (sum <= input) {
                            if (sum == input && lt < rt) {
                                count++;
                          //      System.out.println("lt : " + lt + ", rt : " + rt);
                            }
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nInput = sc.nextInt();
        Main main = new Main();
        main.solution(nInput);
    }
}

