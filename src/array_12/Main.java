package array_12;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void solution(int n, int[][] arr) {

        // A 학생이 대상이다
        // A 학생이 멘티를 만들 수 있는 수는? -> 모든 수학 테스트에서 등수가 앞서야함.

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                boolean flag = true;
                for (int k = 0; k < arr.length; k++) {
                    int mentoRank = 0; // i+1 학생이 해당 시험에서 몇 번 인덱스에 있는지 알아야 함.
                    int menteeRank = 0;

                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i + 1) {
                            mentoRank = l;
                        }

                        if (arr[k][l] == j + 1) {
                            menteeRank = l;
                        }
                    }

                    if (mentoRank < menteeRank) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {

        // 학생 수 N
        // M 번의 수학테스트

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int testCount = scanner.nextInt();

        int[][] arr = new int[testCount][studentCount];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        main.solution(studentCount, arr);
    }
}
