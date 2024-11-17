package CoreJava;

public class Patterns_Nested_Loops {

    public static void main(String[] arg) {

      //Half pyramid patter
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print ( "*" );
//            }
//            System.out.println ( );
//        }

        // Inverted half pyramid
//        int n=4;
//        //Outer loop
//        for (int i = 1; i<=n; i++) {
//            // inner loop for space
//            for (int j = 1; j<=(n-i); j++) {
//                System.out.print (" " );
//            }
//            //inner loop for star
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*" );
//            }
//            System.out.println ( );
//        }

        // Half pyramid with nos
//
//        int n=5;
//        for (int i = 0; i <=n; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print (j );
//                            }
//            System.out.println ( );
//                    }

        // Inverted pyramid with NOS

//        int n=5;
//        for (int i=n; i>=1; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print (j );
//            }
//            System.out.println ( );
//        }


        // Inverted half pyramid with NOS :
        // Logic is compare the rows with no of spaces and nos in the sequence
//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j = 1; j <=(n-i) ; j++) {
//                System.out.print (" ");
//            }
//            for (int j = 1; j<=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println ( );
//        }

        /*Floyds triangle with nos */
//        int n=5;
//        int number=1;
//
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print (number+ " ");
//                number++;
//                 }
//            System.out.println ( );
//
//        }
        /* 0-1 triagnle half pyramid
        * Logic of sum=even print 1
        * else sum=odd print 0
        *  */

//        int n=5;
//
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i; j++) {
//                int sum = i+j;
//                if(sum % 2 == 0){
//                    System.out.print("1 " );
//                }
//                else {
//                    System.out.print("0 " );
//            }
//
//        }
//            System.out.println ( );

        /* Solid rhombus */

//        int n=5;
      // outer loop where i i to n i.e.
//        for (int i = 1; i <=n ; i++) {
//            // inner loop to print Space
//            for (int j = 1; j<=n-i ; j++) {
//                System.out.print (" " );
//                     }
//            // inner loop to print *
//            for (int j = 1; j<=n ; j++){
//                System.out.print("*" );
//            }
//            System.out.println ( );
//        }

        int n=5;
        int number = 1;
        for (int i=1; i<=n ; i++) {
            for (int j=1; j<=i ; j++) {
                System.out.print(number);
                number = number+1;
            }
            System.out.println ( );
        }
    }}





