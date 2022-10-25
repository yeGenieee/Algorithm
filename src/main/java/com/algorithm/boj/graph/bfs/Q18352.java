//package com.algorithm.boj.graph.bfs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Q18352 {
//    public static final int MAX = 300001;
//    public static int n, m, k, x;
//    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
//
//    // 모든 도시에 대한 최단 거리 초기화
//    public static int[] dist = new int[MAX];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        k = sc.nextInt();
//        x = sc.nextInt();
//
//        for (int i=0; i<=n; i++) {
//            graph.add(new ArrayList<Integer>());
//            dist[i] = -1;
//        }
//
//        for (int i=0; i<m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            graph.get(a).add(b);
//        }
//
//        dist[x] = 0;
//
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(x);
//
//        while (!queue.isEmpty()) {
//            int now = queue.remove();
//
//            for (int i=0; i < graph.get(now).size(); i++) {
//                int nextNode = graph.get(now).get(i);
//
//                if (dist[nextNode] == -1) {
//                    dist[nextNode] = dist[now] + 1;
//                    queue.add(nextNode);
//                }
//            }
//        }
//
//        boolean check = false;
//        for (int i=1; i <=n; i++) {
//            if (dist[i] == k)
//        }
//
//    }
//}
