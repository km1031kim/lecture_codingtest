package array_3;

import java.util.Scanner;

public class Main {

    public void solution(int[] aInput, int[] bInput) {

        for (int i = 0; i < aInput.length; i++) {

            int a = aInput[i];
            int b = bInput[i];
         //   System.out.println("a = " + a + ", b = " + b);

            if (a == b) {
                System.out.println("D");
                    continue;
            }

            if (a == 1) {
                // 가위일 때
                if (b == 2) {
                    // 바위일 떄
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            }

            if (a == 2) {
                // 바위일 때
                if (b == 1) {
                    // 가위일 떄
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }

            if (a == 3) {
                // 보 일때
                if (b == 1) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int[] A = new int[count];
        int[] B = new int[count];

        String[] aInput = sc.nextLine().split(" ");
        String[] bInput = sc.nextLine().split(" ");

        for (int i = 0; i < count; i++) {
            A[i] = Integer.parseInt(aInput[i]);
            B[i] = Integer.parseInt(bInput[i]);
        }

        Main main = new Main();
        main.solution(A, B);


    }
}
