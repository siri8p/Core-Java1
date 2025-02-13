public class Sumanotherlogic {
    public static void main(String[] args) {
        int sum =10;
         int arr[]= {2,4,5,6,7,8};
         for(int i=0;i<arr.length;i++){
             for(int j=i+1; j<arr.length ;j++){
                 if( arr[j] == sum-arr[i]){
                     System.out.println( i+"  "+j);
                 }
             }
         }
    }
}
