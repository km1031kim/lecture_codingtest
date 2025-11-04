package lru;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cache = new int[s];

        for (int x : arr) {
            int pos = -1;
            for(int i = 0; i < cache.length; i++) {
                if (cache[i] == x) {
                    pos = i;
                }
            }

            if (pos == -1) {
                // 캐시 미스라면 -> 끝에서부터 땡긴다
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                // 캐시 히트라면
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        for (int i = 0; i < s; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}
