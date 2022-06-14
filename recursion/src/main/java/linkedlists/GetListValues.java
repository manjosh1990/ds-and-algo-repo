/*
 * Copyright (C) 2022 Manjosh Ramesh. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package linkedlists;

import java.util.ArrayList;
import java.util.List;

public class GetListValues {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        List<Integer> values =linkedListValues(linkedList.head);

        values.forEach(System.out::println);


        //sum linked list values;
        int sum = getSum(linkedList.head);
        System.out.println("Sum : "+sum);
        //check if data exists
        System.out.println(linkedList.contains(1));

        //get values at index

        System.out.println (linkedList.getValueAt(1));
    }

    private static int getSum(Node head) {
        if(head == null) return 0;
        return head.getData() + getSum(head.getNext());
    }

    private static List<Integer> linkedListValues(Node head) {
        List<Integer> result = new ArrayList<>();
        Node cur = head;
        /*while(cur != null){
            result.add(cur.getData());
            cur = cur.getNext();
        }*/
        fillValues(cur,result);
        return result;
    }

    private static void fillValues(Node cur, List<Integer> result) {
        if(cur == null) return;
        result.add(cur.getData());
        fillValues(cur.getNext(),result);
    }
}
