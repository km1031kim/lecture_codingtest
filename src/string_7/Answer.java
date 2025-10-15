package string_7;

import java.io.*;

public class Answer {


    public String solution(String str) {

        int length = str.length() / 2;


        // s t r i n g    6개 3
        // s t r i n   5개 2

        str = str.toLowerCase();

        for (int i = 0; i < length; i++) {

            char left = str.charAt(i);
            char right = str.charAt(str.length() - 1 - i);

            if (left != right) {
                return "NO";
            }

        }

        return "YES";

    }

    public static void main(String[] args) throws IOException {

        Answer answer = new Answer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(answer.solution(input));
        bw.flush();

        bw.close();
        br.close();

    }
}
