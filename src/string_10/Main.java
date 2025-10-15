package string_10;

import java.io.*;
import java.util.Arrays;

public class Main {

    public int[] solution(String str, String target) {
        int[] result = new int[str.length()];
        char t = target.charAt(0);

        for (int i = 0; i < str.length(); i++) {

            int distance = Integer.MAX_VALUE;

            // 타겟과 일치하는 경우 0
            if (str.charAt(i) == t) {
                result[i] = 0;
                continue;
            }

            // 타겟과 다른 경우

            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == t) {
                    int tmp = Math.abs(i - j);
                    distance = Math.min(distance, tmp);
                }
            }
            result[i] = distance;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] sInput = br.readLine().split(" ");

        String str = sInput[0];
        String target = sInput[1];


        Main main = new Main();
        int[] solution = main.solution(str, target);

        for (int i = 0; i < solution.length; i++) {
            bw.write(solution[i] + " ");
        }
        bw.flush();

        bw.close();
        br.close();

    }
}
