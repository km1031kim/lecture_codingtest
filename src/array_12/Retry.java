package array_12;

import java.util.Scanner;

public class Retry {


    public void solution(int n, int[][] arr) {
        // i번 학생과 j번 학생을 선정, 이후 시험마다 해당 학생의 인덱스 번호를 비교한다.

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                boolean flag = true; // i 가 j의 멘토가 될 수 있는지

                // 시험마다 비교
                for (int k = 0; k < arr.length; k++) {

                    // 멘토와 멘티의 인덱스 추출
                    int mentoRank = 0;
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
                    }
                }

                if (flag) cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {

        // 학생 수 N
        // M 번의 수학테스트

        Retry main = new Retry();
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
