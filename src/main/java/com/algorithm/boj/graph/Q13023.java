package com.algorithm.boj.graph;

import java.util.*;

class Edge {
    int from, to;
    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

public class Q13023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람의 수 n
        int m = sc.nextInt(); // 친구 관계의 수 m

        boolean[][] a = new boolean[n][n]; // 인접 행렬
        ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n]; // 인접 리스트
        ArrayList<Edge> edges = new ArrayList<Edge>(); // 간선 리스트

        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Integer>();
        }

        // 입력 받은 친구 관계를 그래프에 저장
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            a[from][to] = a[to][from] = true;
            g[from].add(to);
            g[to].add(from);
        }

        m *= 2; // 양방향 그래프이므로 간선의 개수 2배

        // 모든 간선의 쌍을 조사
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                // A -> B
                int A = edges.get(i).from;
                int B = edges.get(i).to;

                // C -> D
                int C = edges.get(j).from;
                int D = edges.get(j).to;

                // A, B , C , D가 모두 다르다는 것을 확인 (A -> B, C -> D)
                if ( A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }

                // B -> C 찾기 (인접 행렬 이용)
                if (!a[B][C]) {
                    continue;
                }

                // D -> E 찾기 (인접 리스트 이용)
                for (int E : g[D]) {
                    if (A == E || B == E || C == E || D == E ){
                        continue;
                    }
                }
                System.out.println(1);
                System.exit(0);
            }
        }

        System.out.println(0);
    }

}
