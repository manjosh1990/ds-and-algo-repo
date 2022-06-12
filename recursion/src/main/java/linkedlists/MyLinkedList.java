/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package linkedlists;

public class MyLinkedList {
    Node head;

    public void add(int a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = newNode;
            return;
        }
        Node prev = this.head;
        while (prev.getNext()!= null){
            prev = prev.getNext();
        }
        prev.setNext(newNode);
    }
    public void printNodes(){
        Node currentNode = this.head;
        StringBuilder sb = new StringBuilder("[ ");
        while (currentNode != null){
            sb.append(currentNode.getHead());
            currentNode = currentNode.getNext();
            if(currentNode!=null){
                sb.append(" ,");
            }
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    public Node reverse(){
        if(head == null || head.getNext() == null) return head;
        Node currentHead = head;
        head = head.getNext();
        Node p = reverse();
        currentHead.getNext().setNext(currentHead);
        currentHead.setNext(null);
        return p;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.printNodes();

        myLinkedList.reverse();
        myLinkedList.printNodes();
    }
}

class Node {
    private int head;

    public Node(int data) {
        this.head = data;
    }

    private Node next = null;

    public int getHead() {
        return head;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}