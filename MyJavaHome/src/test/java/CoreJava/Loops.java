package CoreJava;

import java.util.Scanner;

public class Loops {

    public static void main(String [] arg) {

        //      Scanner si = new Scanner (System.in );
        /* Print Number in range of 1-50 */
  /*      int n = 50;

                for(int i=1; i<=n;i++){
                    System.out.println (i);

                }*/
        /* print sum of even numbers from 1 to 100 using while */
//         int sum = 0;
//        int i = 0;
//                while (i<100) {
//                    sum = sum + i;
//                    i = i + 2;
//                    System.out.println (i );
//                }
//                    System.out.println (sum);

        /* print sum of odd numbers from 1 to 100 using while */
//        int sum = 0;
//        int i = 1;
//        while (i<99) {
//            sum = sum + i;
//            i = i + 2;
//            System.out.println (i);
//        }
//        System.out.println (sum);
//    }
        /* sum of Factorial of no from 1 to 100 using for loop*/
//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            sum = 1 * i * ( i + 1 );
//            System.out.println ( "mod of "+i+ " is " +sum );
//        }
//        System.out.println ( sum );
//
//    }

        /*Multiplication table of input provide from system using for loop*/
        Scanner si = new Scanner ( System.in );
        int n = si.nextInt ( );
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println ( " The table of "+n+ " = "+n+ " * "+i );
        }

    }


}





