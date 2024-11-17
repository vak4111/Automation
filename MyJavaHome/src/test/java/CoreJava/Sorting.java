package CoreJava;

public class Sorting {

    public static <arr> void main(String[] args) {

//        // Bubble sort (asc and desc)
        int arr[] = {7, 8, 3, 1, 2};
//       MM for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if (arr[j] > arr[j+1]){
//                        int Temp = arr[j] ;
//                        arr[j] = arr[j+1];
//                        arr[j+1] = Temp;
//                }
//
//            }
//
//        }
//
//        printArray(arr);
//    }

//        public static void printArray(arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print ( +arr[i] + "" );
//        }



        // selection sort

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i + 1];
            arr[i + 1] = temp;

        }
    }
}





