package array_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public void solution(int[][] arr) {
        // 각 열의 합, 행의 합, 두 대각선의 합 중 가장 큰 값 출력

        int max = 0;

        // 대각선의 합 구하기

        // 각 열의 합 구하기

        // 각 행의 합 구하기

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr.length; j++) {
                rowSum += arr[i][j];
            }

            int colSum = 0;
            for (int j = 0; j < arr.length; j++) {
                colSum += arr[j][i];
            }

            max = Math.max(max, rowSum);
            max = Math.max(max, colSum);
        }

        // 대각선 합 구하기
        int downCross = 0;
        int upCross = 0;

        for (int i = 0; i < arr.length; i++) {
            downCross += arr[i][i];
            upCross += arr[i][arr.length - 1 - i];

        }

        max = Math.max(max, downCross);
        max = Math.max(max, upCross);

        System.out.println(max);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[][] array = new int[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        Main main = new Main();
        main.solution(array);
    }
}
