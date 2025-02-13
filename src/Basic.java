public class Basic {
    public static void main(String[] args) {
        int[] arr = {6, 3};

        swap(arr);
        System.out.println( arr[0] + " "+arr[1]);

    }

    public static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for ( int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


    }

}