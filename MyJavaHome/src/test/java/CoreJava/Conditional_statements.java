package CoreJava;

import java.util.Scanner;

public class Conditional_statements {

    /* IF statement example */

    public static void main(String[] Arg) {
// scanner class is used to take inputs
//        Scanner si = new Scanner(System.in);
//        int x = si.nextInt ();
// % function is used to check whether number is odd or even
//        if (x%2==0 && x==100){
        //           System.out.println ("even number" );
        //       }
        //      else {
        //           System.out.println ("odd" );
        //       }

        /* else if example --> advantage is that java only executes the condition it meets and ignores the below ones*/

        //      Scanner P = new Scanner (System.in);
 /*       int o = P.nextInt ();
        int f = P.nextInt ();
        if (o==f) {
            System.out.println ( "equal" );
        }
            else if (o<f) {
            System.out.println ( "lesser" );
        }
                else {
                    System.out.println ("greater" );
                }
            }*/
 Scanner si = new Scanner (System.in);
 int button = si.nextInt ();
 switch(button){
     case 1 :
         System.out.println ("hello" );
         break;
     case 2 :
         System.out.println ("namaste" );
         break;
     case 3:
         System.out.println ("bonjour" );
         break;
     default:
         throw new IllegalStateException("Unexpected value: " + button);
 }
    }
}


