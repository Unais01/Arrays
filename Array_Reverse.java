public class Array_Reverse {
    public static void getReverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (arr[start ]< arr[end]) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 8, 9 };
        printArr(arr);
        System.out.println("");
        getReverse(arr);
 
    }
}
