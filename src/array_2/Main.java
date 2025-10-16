package array_2;

import java.util.Scanner;

public class Main {

    // 최대값보다 작은 애들만

    public int solution(int[] array) {

        int cnt = 1;
        int max = array[0];


        for (int i = 1; i < array.length; i++) {
            // max보다 크면 갱신
            if (array[i] > max) {
                cnt++;
                max = array[i];
            }
        }

        return cnt;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String[] sInput = sc.nextLine().split(" ");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sInput[i]);
        }

        Main a = new Main();
        System.out.println(a.solution(array));

    }
}
