package string_1;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static int solution(String a, String b) {

        a = a.toUpperCase();
        b = b.toUpperCase();
        int answer = 0;

        for (char c : a.toCharArray()) {
            if (c == b.charAt(0)) {
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

