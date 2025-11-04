package lru;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cache = new int[s];

        for (int x : arr) {
            // 캐시 히트, 미스 확인
            int pos = -1; // 인덱스
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            // 캐시 미스 -> 땡긴다
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--){
                    cache[i] = cache[i - 1];
                }
            } else {
                // 캐시 히트 -> pos부터 땡긴다
                for (int i = pos; i >= 1; i--){
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        for (int i = 0; i < cache.length; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}
