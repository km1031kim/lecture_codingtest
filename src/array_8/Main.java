package array_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //Time: 133ms Memory: 27MB Lang: Java 닉네임: 363fcb25a7374a6186a4
    public void solution(int[] array) {

        int[] original = new int[array.length];
        System.arraycopy(array, 0, original, 0, array.length);
        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();

        int rate = 0;
        int before = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            // 이전 값과 동일하다면, rate 증가
            int tmp = array[i];

            if (tmp == before) {
                rate++;
            } else {
                rate++;
                map.put(tmp, rate);
                before = tmp;
            }
        }

        for (int i = 0; i < original.length; i++) {
            System.out.print(map.get(original[i]) + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(array);
    }
}
