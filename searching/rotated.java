package searching;

public class rotated{
    public static int bSearch(int a[], int key )
    {
        int low=0, high=a.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid] == key)
            {
                return mid;
            }
            if(a[low]<a[mid])
            {
                if(key>=a[low])
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}