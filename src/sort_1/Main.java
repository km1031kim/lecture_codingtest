package sort_1;

import java.util.*;

public class Main {


    public void solution(int[] first, int[] second) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < first.length; i++) {
            list.add(first[i]);
        }

        for (int i = 0; i < second.length; i++) {
            list.add(second[i]);
        }

        list.sort(null);

        for (Integer i : list) {
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
