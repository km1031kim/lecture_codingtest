package string_12;

import java.io.*;

public class Main {

    public String solution(int count, String str) {

        String[] split = new String[count];

        for (int i = 0; i < count; i++) {
            split[i] = str.substring(i * 7, (i + 1) * 7);
        }

      //  System.out.println("split = " + Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace('#', '1').replace('*', '0');
        }

     //   System.out.println("split = " + Arrays.toString(split));

        String answer = "";

        for (int i = 0; i < split.length; i++) {
            // 2진수로 바꾸기
            int num = Integer.parseInt(split[i], 2);
            char c = (char) num;
            answer += c;
        }


        return answer;
    }


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int count = Integer.parseInt(br.readLine());
        String sInput = br.readLine();

        Main main = new Main();

        bw.write(main.solution(count, sInput));
        bw.flush();

        bw.close();
        br.close();
    }
}
