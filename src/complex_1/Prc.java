package complex_1;

import java.util.Scanner;

public class Prc {

    public void solution(int N, int M, int[] array) {


        int lt = 0;
        int sum = 0;
        int answer = 0;

        for (int rt = 0; rt < N; rt++) {

            // 일단 계속 rt를 더한다
            sum += array[rt];

            if (sum == M) {
                answer++;
            }

            // 목표값과 같거나 크다면, lt를 빼야한다. 목표값보다 작아질때까지
            while (sum >= M) {
                sum -= array[lt];
                lt++;
                // 빼면서 M과 같아질 수 있음. 이 때 answer++. 그리고 이게 마지막 while 반복문임.
                // 아래 조건에 걸린다면, 다음 rt를 더했을 때도 위 로직이 수행됨.
                // 말로 이해해야한다.
                // rt는 계속 더하는거임.
                // 더한 후 값이 M이면 answer++ 인데, M 이상인 경우가 있음.
                // M 이상이면 lt 값을 빼주고, lt를 하나 올려줄거임
                // lt값을 sum에서 뺏는데도 계속 M 이상일 수 있으니까 while문 도는거고,
                // 빼는 도중에 M과 같아질 수 있으니까 이 때 answer++ 해줌.
                // M과 같아지는 경우에 다음 rt 증가분은 무조건 해당 while에 들어오고
                // 다시 M보다 작아질때 까지 lt값을 빼게 된다.
                if (sum == M) {
                    answer++;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Prc main = new Prc();
        main.solution(N, M, array);
    }
}
