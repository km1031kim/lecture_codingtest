package string_1;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static int solution(String a, String b) {

        List<String> sInput = new ArrayList<>();
        String target = b.toLowerCase();
        int answer = 0;

        for (char c : a.toCharArray()) {
            sInput.add(String.valueOf(c).toLowerCase());
        }

        for (String s : sInput) {
            if (s.equals(target)) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = solution(a, b);
        System.out.println(result);
    }
}

