package string_6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public String solution(String str) {

        String answer = "";

        Set<Character> set = new HashSet<>();
        List<Character> arrayList = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                continue;
            }

            arrayList.add(c);
            set.add(c);
        }

        return arrayList.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) throws IOException {

        Main M = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(M.solution(input));
        bw.flush();

        bw.close();
        br.close();
    }
}
