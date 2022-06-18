/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package linkedlists;

public class SinglyLinkedList {
    private ListNode head;


    //Simple Node
    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printNodes() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("null");
    }

    //count the length of the linkedList
    public int length() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    //insert a new node at the begining of the linkedList
    public void insertAtBegning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    // insert a new node to the linkedList
    public void add(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connect
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.printNodes();
        System.out.println(list.length());
        list.insertAtBegning(5);
        list.printNodes();

        list.add(15);
        list.printNodes();
    }
}
