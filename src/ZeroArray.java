public class ZeroArray {
    public static void main(String[] args) {
        int pos =0;
        int nums[] ={0,2,0,7,9};
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]!=0){
              nums[pos]  = nums[i];
              pos++;
            }
        }
        for (int i= pos; i<nums.length; i++){
                 nums[i]=0;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
