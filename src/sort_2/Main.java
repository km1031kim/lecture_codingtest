package sort_2;

import java.util.Scanner;
import java.util.*;

public class Main {

    public void solution(int[] first, int[] second) {


        Set<Integer> set_1 = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < first.length; i++) {
            set_1.add(first[i]);
        }


        for (int i = 0; i < second.length; i++) {
            if (set_1.contains(second[i])) {
                arrayList.add(second[i]);
            }
        }

        arrayList.sort(null);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstLength = sc.nextInt();

        int[] firstArray = new int[firstLength];
        for (int i = 0; i < firstLength; i++) {
            firstArray[i] = sc.nextInt();
        }

        int secondLength = sc.nextInt();

        int[] secondArray = new int[secondLength];
        for (int i = 0; i < secondLength; i++) {
            secondArray[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(firstArray, secondArray);
    }
}
