package string_11;

import java.io.*;

public class Main {

    public String solution(String input) {

        char before = input.charAt(0);
        int count = 0;
        StringBuilder answer = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                count++;
                continue;
            }

            // 1부터 반복임.
            if (input.charAt(i) == before) {
                count++;
                continue;
            }

            if (input.charAt(i) != before) {
                // 추가해야함

                if (count == 1) {
                    answer.append(before);
                } else {
                    answer.append(before);
                    answer.append(count);
                }
                before = input.charAt(i);
                count = 1;
            }
        }

        if (count == 1) {
            answer.append(before);
        } else {
            answer.append(before);
            answer.append(count);
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        Main main = new Main();
        String result = main.solution(input);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
