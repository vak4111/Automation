package CoreJava;

import java.util.Scanner;


//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

public class Arrays {

    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 99;
//        marks[1] = 98;
//        marks[2] = 100;
//        System.out.println (marks[0]);
//        }

        /* second way to write array*/

//        int marks[] = {1, 2, 8, 5, 9};
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println ( marks[i] );
//        }
//            int num[] = new int[size];
//        for (int i = 0; i <num.length ; i++) {
//            System.out.println (num[i]);
//
//        }

        /*Take input from user. search for given number x and print the index at which it occurs*/
        /* Logic :
        1. Take input from user for lenght of string for e.g. 5
        2. Create for loop to create lenght of array for e.g. 5 boxes of array
        3. Take input for that 5 boxes of array
        4. Take input as X from user to find the index
        5. now traverse through array using numbers.lenght (it gives lenght of array)
        6. Provide if condition until you get that number == X
        * */

        //Input for array size
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        //for loop to convert string into numbers lenght
//        for (int i = 0; i<size; i++) {
//            numbers[i]= sc.nextInt( );
//        }
//        // input for no from user
//        int x = sc.nextInt( );
//        //output
//        for (int i = 0; i<numbers.length; i++) {
//            if (numbers[i]==x) {
//                System.out.println ("X found at index: "+ i);
//
//            }

            /*Take an array of names as input from the user and print them on the screen.
             Ans :
             Logic :
             1. Take input as size from user for array
             2. take name as input from user using scanner
             2.
             */

            // Take size of array as input from user

//            Scanner sc = new Scanner(System.in);
//            int size = sc.nextInt();
//            String names[]= new String[size];
//
//        for (int i = 0; i <size; i++) {
//            names[i]= sc.next ();
//          //  System.out.println ("The value entered are : " +names[i]);
//        }
//      // output
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println("name " + (i+1) +" is : " + names[i]);
//        }

        /* Find the maximum & minimum number in an array of integers.

         * Logic :
         1. take lenght of array as input from user
         2. create array of the number of size from user using for loop
         3. */

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //for loop to convert string into numbers lenght
        for (int i = 0; i<size; i++) {
            numbers[i]= sc.nextInt( );
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
            {
                min = numbers[i];
                        }
            if (numbers[i] > max){
                max = numbers[i];
                   }

    }
        System.out.println (" Min Num is : "+ min);
         System.out.println ("max num is : " +max);

         /* Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

      Logic :

      **To remember is take the lenght of array with input from user**
      ** start your arr from 2nd array location**+
      ** compare if ( i > i-1) return false else return true*/

//      Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        //for loop to convert string into numbers lenght
//        for (int i = 0; i<size; i++) {
//            numbers[i]= sc.nextInt( );
//        }
//        boolean isasending = true;
//
//        for (int i = 1; i <numbers.length ; i++) {
//
//            if (numbers[i] < numbers[i-1]){
//                isasending = false;
//            }
//                    }
//
//        if(isasending) {
//            System.out.println ( "sorted asc order string" );
//        }else{
//            System.out.println ( "NOT sorted string" );
//            }

        }

    }


