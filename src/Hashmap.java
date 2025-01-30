import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
//        int  nums = (2,3,4,5);
//        int  target =9;
//
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//             int curr =nums[i];
//             int x = target-curr;
//            if(map.containsKey(x)){
//                return new int[] {map.get(x),i};
//            }
//            map.put(curr,i);
//        }

//        int nums[] = {2, 3, 4, 5}; // Corrected array initialization
//        int target = 9;
//
//        // Call the method and store the result
//        int[] result = twoSum(nums, target);
//
//        // Print the result
//        if (result.length == 2) {
//            System.out.println("Indices: " + result[0] + ", " + result[1]);
//        } else {
//            System.out.println("No solution found!");
//        }
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int curr = nums[i];
//            int x = target - curr;
//
//            if (map.containsKey(x)) {
//                return new int[]{map.get(x), i}; // Return indices of the two numbers
//            }
//
//            map.put(curr, i);
//        }
//
//        return new int[0]; // Return an empty array if n
        int nums[] = {2, 3, 4, 5}; // Define an integer array
        int target = 9; // Set the target sum

        // Call the twoSum method
        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int x = target - curr;

            if (map.containsKey(x)) {
                System.out.println("Indices: " + map.get(x) + ", " + i); // Print indices instead of returning
                return; // Stop execution once the pair is found
            }

            map.put(curr, i);
        }

        System.out.println("No solution found!"); // Print message if no pair is found
    }
}




