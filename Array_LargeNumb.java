import java.util.*;
public class Array_LargeNumb {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;// Minus Infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
            if (smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest "+smallest);
        return largest;

    }
    
    public static void main(String[] args) {
        int arr[]={5,56,100,22,33};
        System.out.println(getLargest(arr));
    }
}
