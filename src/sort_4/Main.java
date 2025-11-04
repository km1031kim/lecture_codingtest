package sort_4;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // 세팅
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int i1 = sc.nextInt();
            arr[i] = i1;
        }


        // 선택 정렬
        for (int i = 1; i < N; i++) {
            int tmp = arr[i]; // 선택되서 들어갈 대상
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;

        }

    }
}
