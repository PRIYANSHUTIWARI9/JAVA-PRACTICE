
public class insert {
  public static void insertionSort(int[] arr, int n)
  {
    for(int i=1; i<n;i++)
    {
        int temp = arr[i];
        int j=i-1;
        while(j>=0 && arr[j]> temp)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
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
      insertionSort(arr, n);
      printarray(arr, n);

      
  }
    
}
