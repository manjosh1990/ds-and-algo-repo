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

    //LinkedList insert method
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

    private void printValues(Node head, StringBuilder sb){
        //recursive
        if(head == null) return;
        sb.append(head.getData());
        if(head.getNext()!= null) sb.append(", ");
        printValues(head.getNext(),sb);
    }
    public void printNodes(){
        Node currentNode = this.head;
        StringBuilder sb = new StringBuilder("[ ");
        printValues(currentNode,sb);
        //iterative method
        /*while (currentNode != null){
            sb.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if(currentNode!=null){
                sb.append(", ");
            }
        }*/
        sb.append(" ]");
        System.out.println(sb);
    }

    public Node reverse(){
        //recursive
        /*if(head == null || head.getNext() == null) return head;
        Node currentHead = head;
        head = head.getNext();
        Node p = reverse();
        currentHead.getNext().setNext(currentHead);
        currentHead.setNext(null);
        return p;*/

        //iterative
        Node prev = null;
        /*Node current = this.head;
        while (current != null){
            Node next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return this.head = prev;*/
        this.head = recursiveReverse(this.head,prev);
        return this.head;
    }

    public Node recursiveReverse(Node head, Node prev){
        if(head == null) return prev;
        Node next = head.getNext();
        head.setNext(prev);
        return recursiveReverse(next,head);
    }

    //find if value exists
    public boolean contains(int value){
        Node current = this.head;
        //iterative method
        /*while (current!= null){
            if(current.getData() == value) return true;
            current = current.getNext();
        }*/
        return linkedlistFind(current,value);
      //  return false;
    }
    public boolean linkedlistFind(Node head, int value){
        if(head == null) return false;
        if(head.getData() == value) return true;
        return linkedlistFind(head.getNext(),value);
    }

    // get value at index
    public Integer getValueAt(int index){
        int count =0;
        Node cur =  this.getHead();
        //iterative method
        /*while(cur != null){
            if(count == index) return cur.getData();
            cur = cur.getNext();
            count++;
        }*/
        return getValueAtRecursive(cur,index);
    }
    public Integer getValueAtRecursive(Node head, int index){
        if(head == null) return null;
        if(index == 0) return head.getData();
        return getValueAtRecursive(head.getNext(),--index);
    }
    //testing
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

