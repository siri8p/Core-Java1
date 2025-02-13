import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        int nums[] = {2, -7, 11, 15};
        int target = 9;

//        // Call the method and store the result
      int[] result = twoSum(nums, target);
//
        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1}; // Return 1-based indices
            } else if (sum < target) {
                l++; // Move left pointer forward
            } else {
                r--; // Move right pointer backward
            }
        }

        return new int[] {-1,-1}; // Return an empty array if no solution is found
    }
}


