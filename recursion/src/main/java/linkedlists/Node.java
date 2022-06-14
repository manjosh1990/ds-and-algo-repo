/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package linkedlists;

public class Node {
    private int data;
    public Node(){

    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    private Node next = null;
    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
