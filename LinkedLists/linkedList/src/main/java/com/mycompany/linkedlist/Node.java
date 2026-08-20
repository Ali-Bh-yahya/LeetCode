
package com.mycompany.linkedlist;

public class Node<T> {
    T data ;
    Node next;
    
    //Constructor to initialize a node 
    Node(T data){
        this.data = data;
        this.next = null; // Initially points to null
    }
}
