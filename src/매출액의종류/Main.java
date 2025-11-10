package 매출액의종류;

import java.util.*;

public class Main {

    public void solution(int N, int K, int[] array) {

        int length = N - K;
        Map<Integer, Integer> map = new HashMap<>();

        // 초기세팅

        for (int i = 0; i < K; i++) {
            Integer value = map.getOrDefault(array[i], 0);

            map.put(array[i], ++value);
        }



        for (int i = 0; i <= length ; i++) {

            if (i == 0) {
                System.out.print(map.size() + " ");
                continue;
            } else {
                // 이전거 빼기
                int prevKey = array[i - 1];
                int prevValue = map.get(prevKey);

                if (prevValue == 1) {
                    map.remove(prevKey);
                } else {
                    map.put(prevKey, --prevValue);
                }

                // 다음거 더하기

                int nextKey = array[i + K - 1];
                int nextValue = map.getOrDefault(nextKey, 0);
                map.put(nextKey, ++nextValue);
            }


            // 사이즈 출력
            System.out.print(map.size() + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sInput = sc.nextLine().split(" ");
        int N = Integer.parseInt(sInput[0]);
        int K = Integer.parseInt(sInput[1]);

        int[] array = new int[N];
        String[] arrayInput = sc.nextLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayInput[i]);
        }

        Main main = new Main();
        main.solution(N, K, array);

    }
}
