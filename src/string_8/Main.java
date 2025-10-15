package string_8;

import java.io.*;

public class Main {

    public String solution(String str) {

        // 특수문자 제거
        // A-Z 까지가 아니면 -> 교체
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String result = new StringBuilder(str).reverse().toString();

        return str.equals(result) ? "YES" : "NO";
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
