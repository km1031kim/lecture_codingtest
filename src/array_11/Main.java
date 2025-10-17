package array_11;

import java.util.*;

public class Main {


    public void solution(int[][] history) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < history.length; i++) {
            map.put(i + 1, new HashSet<Integer>());
        }

        for (int i = 0; i < history.length; i++) {
            // 학생
            int student = i + 1;
            //System.out.println("학생 번호 : " + student);
            Set<Integer> set = map.get(student);

            for (int j = 0; j < history[0].length; j++) {
                // 학년, 현재 반
                int clazz = history[i][j];
                //System.out.println("학생 학년 : " + (j + 1) + ", 학생 반 : " + clazz);


                for (int k = 0; k < history.length; k++) {
                    // 반

                    if (i == k) {
                        continue;
                    }

                    int targetClazz = history[k][j];
                    // System.out.println("비교 학생 번호 : " + (k+1) + ", 비교 학생 반 : " + targetClazz);

                    if (clazz == targetClazz) {
                        set.add(k + 1);
                    }
                }
            }
        }

        int maxSize = 0;

        for (Integer i : map.keySet()) {
            maxSize = Math.max(maxSize, map.get(i).size());
        }

        for (int i = 1; i <= history.length; i++) {
            if (maxSize == map.get(i).size()) {
                System.out.println(i);
                break;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] history = new int[count][5];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 5; j++) {
                history[i][j] = sc.nextInt();
            }
        }

        Main main = new Main();
        main.solution(history);

    }
}
