/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 */

package linkedlists;

public class FindLoopInLikedList {
    public static void main(String[] args) {
        Node n1 = new Node(7);
        n1.setNext(new Node(58));
        n1.getNext().setNext(new Node(36));
        n1.getNext().getNext().setNext(new Node(34));
        n1.getNext().getNext().getNext().setNext(new Node(16));
        /*n1.getNext().getNext().getNext().getNext().setNext(new Node(6));
        n1.getNext().getNext().getNext().getNext().getNext().setNext(new Node(7));
*/
        Node cur = n1;
        Node tail = null;
        while (cur != null) {
            tail = cur;
            cur = cur.getNext();
        }
        printNode(n1);
        System.out.println("tail :" + tail.getData());

        //create loop
        cur = n1;
        for (int i = 1; i <= 1; i++) {
            cur = cur.getNext();
        }
        tail.setNext(cur);
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        //                     |    |  5 6 7 are in loop
        //                     | <- 7
        //  System.out.println(n1);
        Node meet = detectLoop(n1);
        System.out.println(meet != null);
        removeLoop(n1, meet);
        printNode(n1);
        meet = detectLoop(n1);
        System.out.println(meet != null);
    }

    public static Node detectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public static void printNode(Node head) {
        if (head == null) return;
        System.out.println(head.getData());
        printNode(head.getNext());
    }

    public static void removeLoop(Node slow, Node fast) {
        Node head = slow;
        Node meet = fast;
        if (head == meet) {
            while (meet.getNext() != head){
                meet = meet.getNext();
            }
            meet.setNext(null);
        } else {
            while (head.getNext() != meet.getNext()) {
                head = head.getNext();
                meet = meet.getNext();
            }
            meet.setNext(null);
        }
    }
}