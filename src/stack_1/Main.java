package stack_1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public void solution(String str) {


        ArrayDeque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);


            if (tmp == '(') {
                stack.push(tmp);
                continue;
            }

            if (tmp == ')') {
                if (!stack.isEmpty() && stack.peekFirst() == '(') {
                    stack.pop();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Main main = new Main();
        main.solution(input);
    }
}


