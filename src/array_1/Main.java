package array_1;

import java.util.Scanner;

public class Main {


    public boolean solution(int[] array) {


        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i] + " ");
                continue;
            }

            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int count = Integer.parseInt(sc.nextLine());
        int[] array = new int[count];
        String[] sInput = sc.nextLine().split(" ");

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(sInput[i]);
        }

        main.solution(array);

    }
}
