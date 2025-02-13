public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {12,13, 35,47,49,49};
        int index = removeDuplicates(nums);
        System.out.println("Unique elements count: " + index);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0; // Handle empty array case

        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }
        return index;
    }
}


