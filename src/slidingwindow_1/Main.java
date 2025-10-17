package slidingwindow_1;

import java.util.Scanner;

public class Main {

    public void solution(int length, int days, int[] array) {

        int max = 0;
        for (int i = 0; i < days; i++) {
            max += array[i];
        }

        int before = max;

        for (int i = 1; i <= length - days; i++) {
            int tmp = before - array[i - 1] + array[i + days - 1];
            max = Math.max(tmp, max);
            before = tmp;
        }

        System.out.println(max);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int days = sc.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(length, days, array);
    }
}
