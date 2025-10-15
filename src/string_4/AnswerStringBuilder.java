package string_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnswerStringBuilder {

    public List<String> solution(int n, String[] str) {
        List<String> answer = new ArrayList<>();

        for (String x : str) {

            // String은 불변 객체. 새로운 객체를 만들어서 대입. 객체가 자꾸 생성된다.
            // StringBuilder는 문자를 추가하고 딜리트해도 객체가 여러개 만들어지지 않는다.
            // String 연산이 많아지면 StringBuilder 사용이 유리하다.
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        AnswerStringBuilder T = new AnswerStringBuilder();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println("x = " + x);
        }
    }
}
