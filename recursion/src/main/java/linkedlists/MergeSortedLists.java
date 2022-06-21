/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 *
 * Code to merge two sorted linked lists;
 */

package linkedlists;

public class MergeSortedLists {

    public static void main(String[] args) {
        MyLinkedList mL1 = new MyLinkedList();
        mL1.add(1);
        mL1.add(8);
        mL1.add(22);
        mL1.add(40);

        MyLinkedList mL2 = new MyLinkedList();
        mL2.add(4);
        mL2.add(11);
        mL2.add(16);
        mL2.add(20);

        mL1.printNodes();
        mL2.printNodes();
        MyLinkedList newMyLinkedList = sortedMerge(mL1, mL2);
        newMyLinkedList.printNodes();
    }

    public static Node sortedMerge(Node A, Node B) {
        if (A == null) return B;
        if (B == null) return A;

        if (A.getData() < B.getData()) {
            A.setNext(sortedMerge(A.getNext(), B));
            return A;
        } else {
            B.setNext(sortedMerge(A, B.getNext()));
            return B;
        }
    }

    public static MyLinkedList sortedMerge(MyLinkedList a, MyLinkedList b) {
        Node A = a.getHead();
        Node B = b.getHead();
        Node mergedNodes = sortedMerge(A, B);
        MyLinkedList newMylinkedList = new MyLinkedList();
        newMylinkedList.setHead(mergedNodes);
        return newMylinkedList;
    }
}
