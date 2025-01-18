public class Arrays {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 8, 2, 1};
        int target =1;
        int result = linearSearch(nums, target);
        if (result != -1)
            System.out.println("element found at index  " + result);
        else
            System.out.println("element is not found");


    }
    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
           return -1;
    }
}




