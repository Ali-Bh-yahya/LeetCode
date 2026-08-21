//A Linked List is a linear data structure where elements (called nodes) are linked using pointers.
//node contains two parts:
//1-Data: Stores the actual value.
//2-Next: A reference (or pointer) to the next node in the list.

package com.mycompany.linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        //check the size :
        int size = linkedList.size();
        System.out.println(size);
        //check if the linked list is Empty:
        System.out.println(linkedList.isEmpty());
        //Add the items to my linkedList:
        linkedList.addLast(10);
        System.out.println(linkedList);// the out put is  "com.mycompany.linkedlist.MyLinkedList@7344699f" it's a address 
        // but when i implement the toString method it given me the value of the LinkedList
        linkedList.addLast(120);
        System.out.println(linkedList);
        //Add the item to the first of the linkedList :
        linkedList.addFirst(101);
        System.out.println(linkedList);
    }
}
