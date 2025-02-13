public class Water {
    public static void main(String[] args) {
//        int[] height ={1,8,6,2,5,4,8,3,7}
//
//
//        public int maxArea(int[] height) {
//         int max =0;
//         int apointer =0;
//         int bpointer = height.length-1;
//          while(apointer< bpointer) {
//              if (height[apointer]< height[bpointer]){
//                   max = Math.max(max ,height[apointer]*(bpointer-apointer));
//                   apointer =apointer+1;
//              }
//              else{
//                   max = Math.max(max ,height[bpointer] *(bpointer-apointer));
//                    bpointer =bpointer-1;
//              }
//          }
//         return  max;
//    }
//}
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Define the height array

        // Call the maxArea method and print the result
       // System.out.println("Maximum Water Area: " + maxArea(height));
        System.out.println("maximum "+ max(height));

    }

//    public static int maxArea(int[] height) {
//        int max = 0;
//        int apointer = 0;
//        int bpointer = height.length - 1;
//
//        while (apointer < bpointer) {
//            int minHeight = Math.min(height[apointer], height[bpointer]); // Get the smaller height
//            int width = bpointer - apointer; // Calculate the width
//            max = Math.max(max, minHeight * width); // Update max area
//
//            // Move the pointer pointing to the smaller height
//            if (height[apointer] < height[bpointer]) {
//                apointer++;
//            } else {
//                bpointer--;
//            }
//        }
//        return max;
//    }
//}
  public static int max(int[] height){
        int max=0;
         int a=0;
         int b=height.length-1;
         while(a<b){
             if( height[a]<height[b]){
                 max =Math.max(max, height[a]*(b-a));
                  a=a+1;
             }
             else{
                 max= Math.max(max,height[b]*(b-a) );
                 b= b-1;
             }

         }

              return  max;







    }
}