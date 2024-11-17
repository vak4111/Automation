package CoreJava;

import java.util.Scanner;


public class InputDataTest_Practise_percentage_code
{
    public static void main(String[] args) {

// Question : Convert km to miles --> 1 km = 0.621371
        // Please note use double as varibale type as its bigger conversion it will accept into double, but we give as float it will throw error as it surpasses the range of float i.e 2^4
        System.out.println ("Enter the km : " );
        Scanner k1 = new Scanner (System.in );
        float D1 = k1.nextFloat();
        System.out.println ("The value for km is :" +D1 );
        Double M1 = D1* 0.621371;
        System.out.println ("miles are : "+M1 );

        /*
        System.out.println ( "Enter the percenatge for sub 1  : " );
        Scanner s1 = new Scanner ( System.in );
        Float a1 = s1.nextFloat ( );

        System.out.println ( "Enter the percenatge for sub 2  : " );
        Scanner s2 = new Scanner ( System.in );
        Float a2 = s1.nextFloat ( );

        System.out.println ( "Enter the percenatge for sub 3  : " );
        Scanner s3 = new Scanner ( System.in );
        Float a3 = s1.nextFloat ( );

        System.out.println ( "Enter the percenatge for sub 4  : " );
        Scanner s4 = new Scanner ( System.in );
        Float a4 = s1.nextFloat ( );

        System.out.println ( "Enter the percenatge for sub 5  : " );
        Scanner s5 = new Scanner ( System.in );
        Float a5 = s1.nextFloat ( );

        System.out.println ( "marks for five subject are : " );
        System.out.println ( a1 );
        System.out.println ( a2 );
        System.out.println ( a3 );
        System.out.println ( a4 );
        System.out.println ( a5 );
        float total = a1 + a2 + a3 + a4 + a5;
        //int avg = (a1+a2+a3+a4+a5)/5;
        float perc = ( total / 5 );
        System.out.println ( "Percentage of student is :" );
        System.out.println ( perc );

        */
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

