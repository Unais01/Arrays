public class Array_LinearSearch {
    public static int Linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]== key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,6};
        int index = Linearsearch(array, 10);
        if(index == -1){
            System.out.println("Key does not exist");
        }
        else{
            System.out.println("found at index "+ index);
        }
    }

}
