

package com.mycompany.timecomplixty;
import java.util.Scanner;
import java.util.Arrays;

public class TimeComplexity {
    public static void constantTime(){
        System.out.println("Welcome to My Data Structure repo");//O(1) 
        Scanner  in = new Scanner(System.in);//O(1)
        int n = in.nextInt();//O(1)
        int sum = n*(n+1)/2;//O(1)
        System.out.println("Sum = " + sum);//O(1)
        // so the TC is O(1) 
        // , / , % , + ,- , ^ ,  - - , + + , += , -=, /=, *=, input , output , condition   —> all this  constant time O( 1 )
        for(int i=1;i<3;++i){ // O (1)
          System.out.println( i +" - it's O(1) becouse the loop dose not depend on input :) " );//O(1)
        }
        //TC = o(1)
    }
    
    public static void linearTime(){
        Scanner in = new Scanner(System.in);// O(1)
        int n = in.nextInt();//O(1)
        int sum = 0;//O(1)
        for(int i = 0 ; i <= n ; i++){
            sum += i;//O(1)
        }//O(n)
        System.out.println("Sum = " + sum);// O(1)
        // so the TC is O(n)
        //The execution time grows linearly with the size of the input.
        // If an algorithm iterates through all elements in a list once, 
        //like finding a specific element in an unsorted array, it has linear complexity
        int count = 0 ; 
        for(int i= 0,j=0 ; i < n ; i++){
            for(;j < n ; j++)
                count += (i*j);
        }
        System.out.println("counter is " + count );
        //so here this look like O(n^2) but it's O(n) becouse we have here just one iteration
        //so Determine the time complexity by counting how many times the code actually executes.
        // the max TC is O(1)+ O(1) +O(1) + O(1) + O(n) + O(n) = O(2n) 
        // but we just write is O(n) becouse the 2 is constant
    } 
    
    public static void quadraticTime(){
        Scanner in = new Scanner(System.in);//O(1)
        int count = 0 , n = in.nextInt();//O(1)
        for(int i= 0 ; i < n ; i++ ){//O(n)
            for(int j = 0 ; j < n ; j++  ){//O(n)
            count += ( i*j);//O(1)
            }
        }
        System.out.println("Count is  "+ count );//O(1)
        // here is the time complexity is  O(n^2) 
        // calculate the TC O(1) + O(1) + (O(n)*O(n)*O(1)) + O(1) = O(n^2)
        //Time increases quadratically with input size.
        //Nested loops are typical in algorithms with O(n²) complexity, such as selection or bubble sort.
    }
    
    public static void cubicTime(){
        Scanner in = new Scanner(System.in);//O(1)
        int  count = 0 ,  n = in.nextInt();// O(1) 
        for(int i = 0 ; i < n ; i++ ){//O(n)
            for(int j = 0 ; j < n ; j++){//O(n)
                for(int k = 0 ; k < n ; k++){//O(n)
                    count++;//O(1)
                }
            }
        }
        //max TC is O(n^3)
        //Time grows in proportion to the cube of the input size, 
        // often found in algorithms with three nested loops. 
        //Algorithms with cubic complexity are typically inefficient for large datasets.
        int count2 = 0 ; 
        for(int i = 0 ; i < n*n ; i++){//O(n^2)
            for(int j = 0 ; j < n ; j++){//O(n)
                count2 += (i*j);
            }
        }
        //TC = O(n^2)* O(n) = O(n*n*n) = O(n^3)
        System.out.println("count1 = " + count + " , count2 = " + count2 );
    }
    
    
    public static void logarithmicTime(int []arr , int target ){
        System.out.println("Welcome to the binary search ");
        int low = 0 , high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target ){ System.out.println("Found at  index" + mid); return; }
            else if ( arr[mid] < target){ low = mid + 1 ;}
            else{high = mid - 1;}
        }
        System.out.println("Not found");
        //O(log n) arises from the fact that k decreases logarithmically (each iteration reduces it to half the previous value),
        //making the number of steps necessary to reach 0 related by a factor of
        //log2  to the number of iterations required.
        // TC is O(Log n)
    }
    
    public static void linearitiesTime(){
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt()  , s = 1  , j = 1;
        do{//O(n)
            j=1;
            
            do{//O(log n)
                System.out.print("Data Structure");
                j*=2;
            }while(j<n);
            
            s++;
        }while(s<n);
        // TC = O(n)* O(log n) = O(nlog n)  
    }
    
    public static int  sqrt( int n){
        int i = 0 ; 
        while(i*i <= n){
            i++;
        }
        return i-1; 
        // TC = O(sqrt n)
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice ;
        do{
            
            
            System.out.println("\nChoose a method:");
            System.out.println("1 - Constant Time");
            System.out.println("2 - Linear Time");
            System.out.println("3 - Quadratic Time");
            System.out.println("4 - Cubic Time");
            System.out.println("5 - Logarithmic Time");
            System.out.println("6 - Linearities Time");
            System.out.println("7 - Sqrt");
            System.out.println("E - Exit");

            
            choice = in.next().charAt(0);
            switch(choice){
               case'1':
                    constantTime();
                    break;
                
               case'2':
                    linearTime();
                    break;
                
                case'3':    
                    quadraticTime();
                    break;
                
                case'4':    
                    cubicTime();
                    break;
                    
                case'5':
                    System.out.println("inter the size of the Array : ");
                    int size = in.nextInt();
                    int []arr = new int[size];
                    for(int i = 0 ; i< arr.length ; i++ ){
                        System.out.println("enter the value of arr[ "+i+"]");
                        arr[i]=in.nextInt();
                    }
                    System.out.println("inter the target :");
                    int target = in.nextInt();
                    Arrays.sort(arr);
                    logarithmicTime(arr , target);
                    break;
                case'6':
                    linearitiesTime();
                    break;
                    
                case'7':
                    System.out.println("inter the number :");
                    int num = in.nextInt();
                    System.out.println(sqrt(num));
                    break;
                case 'E':
                case 'e':
                    System.out.println("Program terminated.");
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
            }
            
        }while(choice != 'E' && choice != 'e');
          
        in.close();
       
        
        
        
    }
}
