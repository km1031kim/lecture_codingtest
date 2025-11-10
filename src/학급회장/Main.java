package 학급회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public void solution(int N, String input) {

        Map<Character, Integer> map = new HashMap<>();

        char[] array = input.toCharArray();

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            char tmp = array[i];
            Integer value = map.getOrDefault(tmp, 0);
            map.put(tmp, ++value);
            max = Math.max(value, max);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) == max) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();

        Main main = new Main();
        main.solution(N, input);

    }
}
