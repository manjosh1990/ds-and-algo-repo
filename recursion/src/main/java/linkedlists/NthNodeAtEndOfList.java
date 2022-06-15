/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package linkedlists;

public class NthNodeAtEndOfList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.setNext(new Node(2));
        n1.getNext().setNext(new Node(3));
        n1.getNext().getNext().setNext(new Node(4));
        n1.getNext().getNext().getNext().setNext(new Node(5));
        Node result = findNode(n1, 6);
        System.out.println(result);
    }

    private static Node findNode(Node head, int n) {
        if(head == null) return null;
        if(n <=0) return null;
        Node curr = head;
        Node ref = head;
        int count = 0;
        while (count <n){
            if(ref == null) return null;
            ref = ref.getNext();
            count++;
        }
        while (ref!= null){
            ref = ref.getNext();
            curr = curr.getNext();
        }
        return curr;
    }
}
