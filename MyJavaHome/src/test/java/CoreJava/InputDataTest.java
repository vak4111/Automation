package CoreJava;

import java.util.Scanner;


public class InputDataTest {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner s1 = new Scanner(System.in);
        int a1 = s1.nextInt();
        System.out.println("The value of int is : ");
        System.out.println(a1);
float f1 = s1.nextFloat();
    }

 }
    /* Logic to code
    *
    * 1. Scanner class is used to scan numbers from system for e.g. keyboard
    * 2. Create object for scanner with system.in
    * 3. Create Variable of data type int as a1 with functions from scanner class nextint
4. It will ask for input from systems but will accept on int values*
5. print the value you entered
6. similarily you can use other data types as well float, char, double */

