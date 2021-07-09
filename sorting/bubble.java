package sorting;

public class bubble {

    public static void bubbleSort(int[] arr, int n)
    {   
        int temp=0;
        for(int i=0;i<n-1;i++)
        {   boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                swapped = true;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swapped==false)
            {
                break;
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
        bubbleSort(arr, n);
        printarray(arr, n);

        
    }
    
}
