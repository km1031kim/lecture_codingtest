    package array_10;


    import java.util.Scanner;

    public class Main {

        public void solution(int[][] array) {

            int count = 0;
            int[] dx = {0, 0, -1, 1};
            int[] dy = {1, -1, 0, 0};

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {


                    int now = array[i][j];
                    boolean flag = true;

                    for (int k = 0; k < dx.length; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < array.length && ny < array.length && array[nx][ny] >= now) {
                            flag = false;
                        }

                    }
                    if (flag) count++;
                }
            }


            System.out.println(count);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();

            int[][] array = new int[count][count];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }


            Main main = new Main();
            main.solution(array);
        }
    }

