package 공통원소구하기;

import java.util.*;

public class Main {

    public void solution(int[] A, int[] B) {

        Set<Integer> set = new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            if (set.contains(B[i])) {
                arrayList.add(B[i]);
            }
        }

        arrayList.sort(null);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int aSize = sc.nextInt();
        int[] A = new int[aSize];
        sc.nextLine();

        String[] aInput = sc.nextLine().split(" ");

        for (int i = 0; i < aInput.length; i++) {
            A[i] = Integer.parseInt(aInput[i]);
        }

        int bSize = sc.nextInt();
        int[] B = new int[bSize];
        sc.nextLine();

        String[] bInput = sc.nextLine().split(" ");
        for (int i = 0; i < bInput.length; i++) {
            B[i] = Integer.parseInt(bInput[i]);
        }

        Main main = new Main();
        main.solution(A, B);
    }
}
