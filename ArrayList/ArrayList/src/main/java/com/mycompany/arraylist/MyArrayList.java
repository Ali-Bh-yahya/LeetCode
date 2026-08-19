
package com.mycompany.arraylist;


public class MyArrayList <E> {
    private int capacity = 16;
    private E[] arr = (E[]) new Object[capacity];
    private int size ; 
    
    
    //The Ensure Capacity method :
    private void ensureCapacity(){
        E[] temp = (E[]) new Object[arr.length*2];
        
        for(int i = 0 ; i < arr.length ; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
    
    //The add Last method :
    
    public void addLast(E value){ 
        if(size == arr.length){ ensureCapacity();}
        arr[size] = value;
        size ++; 
       
    }
    
    //size method : 
    public int size(){
        return size;
    }
    
    //get method :
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index " + index );
        }
        return arr[index];
    }
    
    //Add By Index method :
    public void addBy(E value , int index ){
        if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException(
                "Invalid index: " + index);
            }

            if (size == arr.length) {
                ensureCapacity();
            }

            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = value;

            size++;
    }
    
   //tostring method :
    public String toString(){
        String str = "";
        for(int i = 0  ; i < size ; i++){
            if(i == 0)
                str += "[ "+arr[i]+ ", ";
            else if(i == size - 1 )
                    str +=arr[i]+ "]";
            else       
                str += arr[i]+"," + " ";
        }
        return str;
    }
    //set method :
    public E set(int index , E value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index :" + index);
        }
        E old = arr[index];
        arr[index] = value;
        return old;
    }
    
    //Is Empty method : 
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    // clear method :
    public void clear(){
        arr = (E[]) new Object[capacity];
        size = 0 ; 
    }
    
    //contain method : 
    public boolean contains( E value){
        for ( int   i = 0 ; i < size ; i++ ){
            if (arr[i] != null && arr[i].equals(value))
                return true;
        }
        return false ; 
    }
    
    //lastIndexOf method  : 
    public int  lastIndexOf( E value ){
        for ( int   i = size-1 ; i >=0 ; i-- ){
            if (arr[i] != null && arr[i].equals(value))
                return i;
        }
        return -1 ; 
    }
    
    //Resize method : 
    public void resize(int newSize ){
        if(newSize < size){
        throw new IllegalArgumentException("New size can't be smaller than current size " + size);
    }
        E[] arr2 = (E[]) new Object[newSize];
        int limt = Math.min(arr.length,newSize);
        for(int i=0 ; i < limt ;  i++)
            arr2[i] = arr[i];
        arr = arr2;    
    }
    
    //removeAt method:
    public E removeAt(int index){
        if(index  < 0 || index >= size ){
            throw new IndexOutOfBoundsException("Invalid index :" + index);
        }
        E romvedValue = arr[index];
        
        for(int i = index ; i < size ; i++ )
            arr[i] = arr[i+1];
        size --;
        return romvedValue; 
    }
    
    //Remove All method : 
    public void removeAll(E element ){
        for(int i = 0 ; i < size ; i++ ){
            if (arr[i] != null && arr[i].equals(element)){
                removeAt(i);
                i--;
            }
        }
    }
    
    //indexOf method :
    public int  indexOf(E value){
             for ( int   i = 0 ; i < size ; i++ ){
            if (arr[i] != null && arr[i].equals(value))
                return i;
        }
        return -1 ;    
    }
    
    //TrimToSize method:
    public void trimToSize(){
        E[] trimArray = (E[]) new Object[size];
        for(int i = 0 ; i < arr.length ; i++ ){
            trimArray[i] = arr[i];
        }
        arr = trimArray;
    }
        
        
}
