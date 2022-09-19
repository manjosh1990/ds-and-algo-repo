/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package trees;

import java.util.ArrayList;
import java.util.List;

public class ConvertToMaxHeap {
    public static void main(String[] args) {
        Node node = new Node(4);
        node.left =new Node(2);
        node.right =new Node(6);
        node.left.left= new Node(1);
        node.left.right= new Node(3);
        node.right.left= new Node(5);
        node.right.right= new Node(7);

        convertToMaxHeapUtil(node);
        printPostOrder(node);
    }
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        List<Integer> list = new ArrayList<>();
        printInorder(root,list);
        bfs(root,new int[]{0},list);
    }

    static void bfs(Node root, int[] i, List<Integer> list){
        if(root==null) return;
        bfs(root.left,i,list);
        bfs(root.right,i,list);
        root.data = list.get(i[0]++);

    }
    static void printInorder(Node root,List<Integer> list){
        if(root==null) return;
        printInorder(root.left,list);
        //System.out.print(root.data+" ");
        list.add(root.data);
        printInorder(root.right,list);
    }

    static void printPostOrder(Node root){
        if(root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left =null;
        right = null;
    }
}
