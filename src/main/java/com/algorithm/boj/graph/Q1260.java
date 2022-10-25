package com.algorithm.boj.graph;

import java.util.*;

public class Q1260 {

    static ArrayList<Integer>[] g; // 인접 리스트
    static boolean [] check; // 방문한 정점 배열

    public static void dfs(int x) {
        if (check[x]) {
            return;
        }
        check[x] = true; // 방문했다 표시
        System.out.print(x + " ");
        for (int y : g[x]) {
            if (!check[y]) {
                dfs(y);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        check[start] = true;

        while(!queue.isEmpty()) {
            int x = queue.remove();
            System.out.print(x + " ");
            for (int y : g[x]) {
                if (!check[y]) {
                    check[y] = true; //  방문했다 표시
                    queue.add(y);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int start = sc.nextInt(); // 탐색을 시작할 정점의 번호

        g = (ArrayList<Integer>[]) new ArrayList[n+1]; // 인접 리스트

        // 인접 리스트 초기화
        for (int i=1; i<=n; i++) {
            g[i] = new ArrayList<Integer>();
        }

        // 입력받은 간선을 인접 리스트에 저장
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            g[from].add(to);
            g[to].add(from);
        }

        for (int i=1; i<=n; i++) {
            Collections.sort(g[i]);
        }
        check = new boolean[n+1];
        dfs(start);
        System.out.println();
        check = new boolean[n+1];
        bfs(start);
        System.out.println();

    }
}
