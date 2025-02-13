//public class Zeros {
//    public static void main(String[] args) {

//        int arr[] ={8,1,0,2,1,0,3};
//        System.out.println(moveZeros(arr));
//
//
//    }
//        int arr[] ={8,1,0,2,1,0,3};
//         int n= arr.length;
//        System.out.println(moveZeors(arr ,n));
//
//
//    }
//
//    public void moveZeros(int[]arr int n){
//        int j=0;
//        for(int i=0;i<n;i ++){
//            if(arr[i]!=0 &&arr[j]==0){
//                int temp= arr[i];
//                arr[i]=arr[j];
//                 arr[j] = temp;
//            }
//            if (arr[j]!=0){
//                j++;
//            }
//        }
//
//
//    }
//
//        int arr[] = {8, 1, 0, 2, 1, 0, 3};
//        int n = arr.length;
//
//        moveZeros(arr, n);
//
//        // Print the modified array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void moveZeros(int[] arr, int n) {
//        int j = 0; // Position to place non-zero elements
//
//        for (int i = 0; i < n; i++) {
////            if (arr[i] != 0) {
////                // Swap only if necessary
////                if (i != j) {
////                    int temp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = temp;
////                }
//            if(arr[i]!=0 &&arr[j]==0){
//                int temp= arr[i];
//               arr[i]=arr[j];
//               arr[j] = temp;
//          }
//               // j++; // Move to the next position for non-zero element
//            if (arr[j]!=0){
//                j++;
//            }
//        }
//    }
//}
//public static void moveZeros(int[] nums){
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                nums[count++]=nums[i];
//            }
//        }
//        while(count<nums.length){
//            nums[count++]=0;
//        }
//
//
//    }
////}
//        int[] nums = {0,3,8,1};
//
//        moveZeros(nums);
//
//        // Print the modified array
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//    }

//    public static void moveZeros(int[] nums) {
//        int count = 0; // Position to place non-zero elements
//
//        // Move non-zero elements to the front
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[count++] = nums[i];
//            }
//        }
//
//        // Fill remaining positions with zeros
//        while (count < nums.length) {
//            nums[count++] = 0;
//        }
//    }
//}