public class searching {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9};
        int target = 9;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}