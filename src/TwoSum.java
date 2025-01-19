public class TwoSum {
    public static void main(String[] args) {
        int a [] ={2,7,11,15};
         int n= a.length;
         int target =9;
         for(int i=0;i<n; i++){
             for(int j=1;j<n; j++){
                 if(a[i]+a[j] ==target){
                     System.out.println(i +" " + j);
                 }
             }
         }
    }
}
