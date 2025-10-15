package string_4;
import java.io.*;
import java.util.*;

public class Main {


    public void solution(String[] str) {

        for (String s : str) {
            StringBuilder sb = new StringBuilder();

            char[] charArray = s.toCharArray();

            for (int i = charArray.length - 1; i >= 0; i--) {
                sb.append(charArray[i]);
            }

            String result = sb.toString();
            System.out.println(result);
        }


    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] sArray = new String[n];

        for (int i = 0; i < n; i++) {
            sArray[i] = br.readLine();
        }

        main.solution(sArray);

        bw.close();
        br.close();
    }
}
