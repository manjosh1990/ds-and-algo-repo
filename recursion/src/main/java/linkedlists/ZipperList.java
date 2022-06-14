/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package linkedlists;

public class ZipperList {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.add(0);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        MyLinkedList list2 = new MyLinkedList();
        list2.add(1);
        list2.add(3);
        list2.add(5);

        list1.printNodes();
        list2.printNodes();
      Node node =  zipNodes(list1.getHead(),list2.getHead());
      MyLinkedList newList = new MyLinkedList();
      newList.setHead(node);
      newList.printNodes();
    }

    private static Node zipNodes(Node head1, Node head2) {
        int count =0;
        Node curr1 = head1.getNext(), curr2 = head2;
        Node newNode = head1;
        while (curr1 !=null && curr2!= null){
            if(count %2 ==0){
                newNode.setNext(curr2);
                curr2 = curr2.getNext();
            }else{
                newNode.setNext(curr1);
                curr1 = curr1.getNext();
            }
            newNode = newNode.getNext();
            count ++;
        }
        if(curr1 != null) newNode.setNext(curr1);
        if(curr2 != null) newNode.setNext(curr2);
        return head1;
    }


}
