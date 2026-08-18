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
        
        
    }
}
