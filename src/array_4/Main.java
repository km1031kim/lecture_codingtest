package array_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void solution(int input) {
        // 피보나치 수열 출력하기
        //

        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 1; i <= input; i++) {
            if (i < 3) {
                arrayList.add(1);
            } else {
                Integer a = arrayList.get((i-1)-2);
                Integer b = arrayList.get((i-1)-1);
                arrayList.add(a + b);
            }
        }
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        Main main = new Main();
        main.solution(input);
    }
}
