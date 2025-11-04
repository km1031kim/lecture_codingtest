package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(arr);

        // lt, rt 세팅
        int lt = 0;
        int rt = n - 1;


        // lt가 rt보다 커지면 멈춰야한다.
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }

            if (arr[mid] > m) {
                // 우리가 찾고자 하는 값보다 중간값이 크면 rt를 줄인다
                rt = mid - 1;
            } else {
                // 우리가 찾고자 하는 값이 크면
                lt = mid + 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }

}
