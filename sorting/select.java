public class select {
    public static void SelectionSort(int[] arr, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {   
                if(arr[j] < arr[min])
                {
                   min = j;
                }
            }
            if(min != i)
            {
                int temp=0;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void printarray(int[] arr , int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,3,7,1,5};

        int n= arr.length;
        SelectionSort(arr, n);
        printarray(arr, n);

        
    }
    
}
