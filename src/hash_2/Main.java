package hash_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public void solution(int N, int K, int[] arr) {

        // 만들어진 구간 갯수
        // 7 - 4 = 3
        int count = N - K;

        HashMap<Integer, Integer> tmp = new HashMap<>();

        // 초기 세팅
        for (int i = 0; i < K; i++) {
            Integer v = tmp.getOrDefault(arr[i], 0);
            tmp.put(arr[i], ++v);
        }
        System.out.print(tmp.size() + " ");

        // value에 해당하는 갯수가 잇음. 그걸 - 해주고 0 이면 빼면됨. 그리고 keySet size 넣으면 끝

        for (int i = K; i < N; i++) {
            int remove = arr[i - K];
            tmp.put(remove, tmp.get(remove) - 1);
            if (tmp.get(remove) == 0) {
                tmp.remove(remove);
            }

            int add = arr[i];
            tmp.put(add, tmp.getOrDefault(add, 0) + 1);

            System.out.print(tmp.size() + " ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solution(N, K, array);

    }
}
