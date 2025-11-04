package kruscal_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 크루스칼. Edge 클래스 생성
 * edge ArrayList 생성, cost로 오름차순 정렬
 * v1, v2, cost
 *
 * 2 9 8
 * 2 3 10
 * 1 2 12    순서대로 부모합치면서 비용 더함. 정렬된 최소값이니까
 *
 * 부모가 같다면 이미 연결된 트리 -> 사이클
 */
public class Main {

    static class Edge implements Comparable<Edge> {

        public int v1;
        public int v2;
        public int cost;

        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static int[] unf;
    public static int Find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = Find(unf[v]);
        }
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge(a, b, c));
        }

        /**
         * 시작
         */

        int answer = 0 ;
        Collections.sort(arr);

        for (Edge ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);

            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);
            }
        }
    }
}
