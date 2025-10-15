package string_9;

import java.io.*;

public class Answer2 {

    public int solution(String str) {

        char[] charArray = str.toCharArray();

        String answer = "";

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        Answer2 main = new Answer2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int solution = main.solution(br.readLine());
        System.out.println("solution = " + solution);
    }
}
