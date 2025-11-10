package 최대길이연속부분수열;

import java.util.Scanner;

public class Main {


    public void solution(int[] array, int K) {

        // 0 개수 체크, 0 개수가 K보다 크면? 가장 왼쪽의 0까지 다 제거해야함.

        int oneCount = 0;
        int zeroCount = 0;
        int answer = 0;
        int lt = 100001;

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i);
            if (array[i] == 1) {
                oneCount++;
            } else if (array[i] == 0){
                zeroCount++;
                if (zeroCount == 1) {
                    lt = i;
                }

            }

            if (zeroCount > K) {
                // 스탑해야함.
                answer = Math.max(oneCount + zeroCount - 1, answer);
                System.out.println("answer = " + answer);
                // 리셋
                i = lt+1;
                oneCount = 0;
                zeroCount = 0;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        String[] sInput = sc.nextLine().split(" ");
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(sInput[i]);
        }

        Main main = new Main();
        main.solution(array, K);
    }
}
