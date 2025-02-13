public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(num));
    }

    public static int maxSum(int[] num) {
        int max = num[0];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }
}
