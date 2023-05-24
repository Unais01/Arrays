public class Array_BinSearch {
    public static int BinarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14, 18, 20, 100 };
        System.out.println("The key at index " + BinarySearch(array, 100));
    }
}
