package string_3;
import java.io.*;
import java.util.*;

public class Answer {

    public String solution(String str) {

        String[] array = str.split(" ");

        String answer = "";

        for (String s : array) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Answer answer = new Answer();
        String result = answer.solution(input);
        System.out.println("result = " + result);


        bw.close();
        br.close();
    }
}
