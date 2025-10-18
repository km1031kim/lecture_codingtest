package hash_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public void solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();



        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);

            Integer aValue = map.getOrDefault(a, 0);
            map.put(a, ++aValue);
        }

        for (int i = 0; i < s2.length(); i++) {
            char tmp = s2.charAt(i);

            if (!map.containsKey(tmp)) {
                System.out.println("NO");
                return;
            }

            Integer v = map.get(tmp);

            if (v == 0) {
                System.out.println("NO");
                return;
            }

            map.put(tmp, --v);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


        Main main = new Main();
        main.solution(s1, s2);

    }
}
