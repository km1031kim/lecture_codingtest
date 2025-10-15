package string_7;

import java.io.*;

public class Main {

    public String solution(String str) {

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        // 대소문자를 구분하지 않고 같은지 확인

        return str.equals(sb.reverse().toString()) ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(main.solution(input));
        bw.flush();

        bw.close();
        br.close();

    }
}
