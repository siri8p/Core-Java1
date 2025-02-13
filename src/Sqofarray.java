

import java.util.Arrays;

public class Sqofarray {
    public static void main(String[] args) {

//        int[] a = {-4, -1, 0, 3, 10};
//
//        int[] result = prodSun(a);
//        //System.out.println("sorted squres:"+ Arrays.toString(result));
//        System.out.println("Sorted Squares: " + Arrays.toString(result));
//
//    }
//        public static int[]  prodSun(int[] a){
//            int[] res = new int[a.length];
//            int  low=0;
//            int high =a.length-1;
//            for(int i= a.length-1;i>=0 ;i-- ){
//                if(Math.abs(a[low]) >Math.abs(a[high])){
//                    res[i] =a[low]*a[low];
//                     low++;
//                    }
//                else{
//                    res[i] = a[high]*a[high];
//                    high--;
//                   }
//             }
//            return res;
//        }
//    }
//
        int[] a = {-4, -1, 0, 3, 10}; // Define the input array

        // Call the prodSun method and print the result
        int[] result = prodSun(a);
        System.out.println("Sorted Squares: " + Arrays.toString(result));
    }

    public static int[] prodSun(int[] a) {
        int[] res = new int[a.length]; // Corrected array initialization
        int low = 0;
        int high = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (Math.abs(a[low]) > Math.abs(a[high])) {
                res[i] = a[low] * a[low];
                low++;
            } else {
                res[i] = a[high] * a[high];
                high--; // Added missing decrement for high pointer
            }
        }
        return res; // Return the sorted squares array
    }
}