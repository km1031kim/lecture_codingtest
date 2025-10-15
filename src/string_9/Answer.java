package string_9;

public class Answer {

    public int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
