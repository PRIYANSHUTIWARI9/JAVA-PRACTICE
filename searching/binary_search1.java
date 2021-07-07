package searching;

// this question is solved by using binarySearch methods
import java.util.Arrays;

public class binary_search1 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int result = Arrays.binarySearch(arr, key);
        if(result < 0)
        {
            System.out.println("Element is not found !");
        }
        else
        {
            System.out.println("element is  found at index: "+result);
        }
    }
    
}
