package CoreJava;

import java.util.*;

public class Strings {

    public static void main(String[] args) {
//
//        StringBuilder sb = new StringBuilder ( "hello" );
//        for (int i = 0; i < sb.length ()/2; i++) {
//
//            int front = i;
//            int back = sb.length()-1-i;
//
//            char frontchar = sb.charAt ( front );
//            char backchar = sb.charAt ( back );
//
//            sb.setCharAt ( frontchar, backchar );
//            sb.setCharAt ( backchar, frontchar );
//
//        }
//        System.out.println(sb)

        /*Palindrome check : string is exact same after reverse e.g. madam ==> madam after reverse */


        StringBuilder str = new StringBuilder ("maadsadasadam");
        StringBuilder reversed = new StringBuilder (str).reverse ( );
        if (reversed.compareTo(str) == 0) {
            System.out.println ( "palindorme is true" );
        } else {
                System.out.println ("palindorme is FALSE" );
            }

        }
        }




