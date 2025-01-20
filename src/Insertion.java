import java.util.HashSet;
import java.util.Set;

public class Insertion {
    public static void main(String[] args) {
        int arr1[] ={2,3,4,5};
        int arr2[] ={5,3,9,2};
        Set<Integer> s= new HashSet<>();
         for(int i=0;i<arr1.length ;i++){
             s.add(arr1[i]);
         }
         for(int i=0 ;i<arr2.length;i++){
             if(s.contains(arr2[i])){
                 System.out.println(arr2[i]);
             }
         }
    }
}
