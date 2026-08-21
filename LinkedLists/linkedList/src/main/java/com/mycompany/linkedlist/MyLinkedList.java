/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author DVDSTORE
 */
public class MyLinkedList<T> {
     private Node<T> head;
    private Node<T> tail;
    private int size;
    // Constructor
    public MyLinkedList(){
        head = null; 
        tail = null;
        size = 0;
    }
    
    // size method :
    public int size(){
        return size;
    }
    
    //isEmpty method :
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    //add to the last method :
    public void addLast(T val){
        Node<T> newNode = new Node<>(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            
        }
        else{
            tail.next = newNode;
            tail = newNode;
            
        }
        size ++;
    }
    
    //toString method :
    public String toString(){
        StringBuilder str = new StringBuilder();
        Node<T> currunt = head;
        while(currunt != null){
            str.append(currunt.data);
            if(currunt.next != null)
                str.append(" , ");
            currunt = currunt.next;
        }
        return str.toString();
    }
    
    //add to the first  method:
    public void addFirst(T val){
        Node<T> newNode = new Node<>(val);
        newNode.next = head;
        head =  newNode;
        if(size == 0 )
            tail = newNode;
        size++;
    }
    
    // add by the index method :
    public void add(int index , T val){ 
        if(index < 0 || index > size )
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size);
        if(index == 0 )
            addFirst(val);
        else if (index == size)
            addLast(val);
        else{
            Node<T> node = new Node<>(val);
            Node<T> currunt = head;
            
            for( int i = 0 ; i < index-1 ; i++)
                currunt = currunt.next; // 1 c=0- c-> 1 2- c=1 c-> 2 
            node.next =currunt.next;
            currunt.next = node;
            size++;
        }
            
    }
    
}
