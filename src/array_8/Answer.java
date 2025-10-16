package array_8;

import java.util.Scanner;

public class Answer {

    public void solution(int[] arr) {
        // 그냥 이중 for문 돌면서 본인보다 큰 수의 갯수 반환하면 된다.

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }


        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Answer main = new Answer();
        main.solution(array);
    }
}
