package com.algorithm.boj.tree;

import java.util.*;
import java.io.*;

public class Q5639 {
    static Node root;
    static ArrayList<Integer> postOrder;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        postOrder = new ArrayList<>();

        root = new Node(Integer.parseInt(br.readLine()));
        String str = null;

        while ((str = br.readLine()) != null && str.length() != 0) {
            Node node = new Node(Integer.parseInt(str));
            putNode(root, node);
        }

        postorder(root);

        for (int i : postOrder) {
            System.out.println(i);
        }

    }

    static void postorder(Node node) {
        if (node.left != null) {
            postorder(node.left);
        }
        if (node.right != null) {
            postorder(node.right);
        }
        postOrder.add(node.key);
    }

    static void putNode(Node startNode, Node inputNode) {
        if (startNode.key > inputNode.key) {
            if( startNode.left != null) {
                putNode(startNode.left, inputNode);
            } else {
                startNode.left = inputNode;
            }
        }
        if( startNode.key < inputNode.key) {
            if( startNode.right != null) {
                putNode(startNode.right, inputNode);
            } else {
                startNode.right = inputNode;
            }
        }
    }
}


class Node {
    int key;

    public Node(int key) {
        this.key = key;
    }

    Node left;
    Node right;
}