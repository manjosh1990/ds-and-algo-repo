/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 *
 * Implementation of a linked list, add, print and reverse methods are implemented
 */

package linkedlists;

public class MyLinkedList {
    Node head;

    public Node getHead() {
        return head;
    }
    public void setHead(Node head){
        this.head = head;
    }

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
            sb.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if(currentNode!=null){
                sb.append(", ");
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

