package string_5;

import java.io.*;

public class Main {


    public String solution(String str) {
        String answer = "";
        // 알파벳끼리만. 특수문자는 제외

        char[] charArray = str.toCharArray();

        int lt = 0;
        int rt = charArray.length - 1;


        while (lt < rt) {

            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char left = charArray[lt];
                char right = charArray[rt];

                charArray[rt] = left;
                charArray[lt] = right;
                lt++;
                rt--;
            }
        }


        return String.valueOf(charArray);
    }


    public static void main(String[] args) throws IOException {

        Main A = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String input = br.readLine();
        bw.write(A.solution(input));
        bw.flush();

        bw.close();
        br.close();
    }
}
