package 연속된자연수의합;

import java.util.Scanner;

public class Answer {

    // 연속된 자연수의 합은 n/2 + 1 만큼만 반복하면 된다.
    // 15라면, 7~8이 최대니까.. 전체를 반복할 필요 없이 8까지만 하면 됨
    // 8, 9 로는 연속되지 않으니까

    public void solution(int n) {
       int answer = 0;
       int sum = 0;
       int m = n / 2 + 1;
       int lt = 0;

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];

                if (sum == n) {
                    answer++;
                }
            }

        }


        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        Answer answer = new Answer();
        answer.solution(nextInt);
    }
}
