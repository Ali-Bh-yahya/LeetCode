// Array list is part of the collection frame work and implementets the list interface.
//The main idea :
// To work with of  group objects.
//it has a Dinamic size .
package com.mycompany.arraylist;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        // The general way to create Object from ArrayList class:
        ArrayList <Object> listName = new ArrayList<>();
        
        // Basic Operation on Array List :-
        
        // add : adding elements.
        
        listName.add(500);
        listName.add("Ali");
        listName.add(true);
        System.out.println(listName);
        
        //remove: Removes an element.
        
        listName.remove(0);
        System.out.println(listName);
        
        //get: Retieves an element at a specigied index.
       
        String name = (String )listName.get(0);
        System.out.println(name);
        
        
        //set: Updaset an element at a spicific position.
        
        listName.set(1 , false);
        System.out.println(listName);
        
        //size: Checking size.
        
        int size = listName.size();
        System.out.println(size);
        
        //contains: Checks if the Array List contains a specific element.
        
        boolean isContain = listName.contains(true);
        System.out.println(isContain);
        
        //isEmpty: Checking if the list is Empty.
        
        boolean isEmpty = listName.isEmpty();
        System.out.println(isEmpty);
        
        // clear: Clearing the list
        
        listName.clear();
        isEmpty = listName.isEmpty();
        System.out.println(listName);
        System.out.println(isEmpty);
        
        //Check my  generic ArrayList i Implement it:
        
        MyArrayList <Integer> myList = new MyArrayList<> ();
        
        
        //Add By  last method :
        myList.addLast(400);
        myList.addLast(100);
        myList.addLast(200);
       
        System.out.println(myList);
        
        //Add By index method :
        myList.addBy(212, 2);
        myList.addBy(512, 0);
        System.out.println(myList);
        
        //RemoveAt method 
        myList.removeAt(0);
        myList.removeAt(2);
        System.out.println(myList);
        
        //RemoveAll methode :
        myList.addLast(100);
        myList.addLast(100);
        myList.addLast(100);
        myList.addLast(100);
        System.out.println("Before removing "+myList);
        myList.removeAll(100);
        System.out.println("After removing " +myList);
        
        //get method:
        int number = myList.get(0);
        System.out.println(number);
        
        //set method:
        myList.set(0, 300);
        System.out.println(myList);
        
        //size method:
        int sizeOfList = myList.size();
        System.out.println(sizeOfList);
        
        //contain method : 
        // if the value is contain  :
        boolean check = myList.contains(300);
        System.out.println(check);
        // if the value is not contain  :
        check = check = myList.contains(22);
        System.out.println(check);
        //index of method :
         myList.addLast(300);
        int index = myList.indexOf(300);
        System.out.println(index);
        
        //lastIndexOf method : 
        
       index =  myList.lastIndexOf(300);
       System.out.println(index);
       
       check = myList.isEmpty();
       System.out.println(check);
       //clear 
       myList.clear();
       System.out.println(myList);
       
       //isEmpty method : 
       check = myList.isEmpty();
       System.out.println(check);
    }
}
