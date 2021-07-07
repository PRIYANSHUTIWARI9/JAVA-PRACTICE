package searching;

public class keyINinfiniteArray {
    public static int searchInfinite(int arr[] , int key)
    {
        int low =0;
        int high = 1;
        while(arr[high]< key)
        {
            low = high;
            high = 2*high;
        }

        return binarySearch(arr, low, high, key);
    }
    public static int binarySearch(int arr[], int low, int high, int key)
    {
        int mid = (low+high)/2;
        while(low<high)
        {
            if(arr[mid] == key)
        {
            return mid;
        }
        else if(arr[mid]> key)
        {
            low= mid+1;
        }
        else 
        {
            high = mid-1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {12,34,23,32,5,42,24,56,67,32};
        int key = 67;
        int result = searchInfinite(arr, key);

        if(result == -1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element found at index" + result);
        }
        


    }
    
}
