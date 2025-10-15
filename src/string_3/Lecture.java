package string_3;

import java.util.Scanner;

public class Lecture {

    public String solution(String str) {
        String answer = "";

        // 가장 작은 값으로
        int m = Integer.MIN_VALUE, pos;

        // indexOf 활용
        while ((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if (str.length() > m) {
            answer = str;
        }


        return answer;
    }
    public static void main(String[] args) {

        Lecture L = new Lecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(L.solution(str));
    }
}
