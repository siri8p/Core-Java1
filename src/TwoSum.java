public class TwoSum {
    public static void main(String[] args) {
        int a [] ={4,5,6,7,9,};
         int n= a.length;
         int target =10;
         for(int i=0;i<n; i++){
             for(int j=1;j<n; j++){
                 if(a[i]+a[j] ==target){
                     System.out.println(i +" " + j);
                 }
             }
         }
    }
}
