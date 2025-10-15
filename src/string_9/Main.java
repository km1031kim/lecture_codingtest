package string_9;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public int solution(String str) {

        IntStream chars = str.chars();
        IntStream digits = chars.filter(Character::isDigit);
        Stream<String> stringStream = digits.mapToObj(i -> String.valueOf((char) i));
        String result = stringStream.collect(Collectors.joining());

        if (result.charAt(0) == '0') {
            result = result.substring(1);
        }

        return Integer.parseInt(result);
    }


    public static void main(String[] args) throws IOException {

        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        bw.write(String.valueOf(main.solution(br.readLine())));
        bw.flush();

        bw.close();
        br.close();
    }
}
