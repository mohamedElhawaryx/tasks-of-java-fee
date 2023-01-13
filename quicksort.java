public class quick_sort {
    public static void main(String[] args) {
      int arr[] =new int[] {1,2,6,9,10,12,4,3,5,0};
    quickSort(arr,0,9);

      for(int x:arr)
        {
           System.out.print(x+" ");
        }
    }
    // to swap two element of the array
     static void  swap(int arr[],int a, int b)
     {
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
     }
     //method to place all the small element left the pivot
    static int partation (int []arr,int low,int high) {
        int pivot = arr[high];
        int i = low; // smaller element index in the array

        for (int j = low; j <= high; j++)  //
        {
            if (arr[j] < pivot) //case if the current element is smaller than the pivot
            {
                swap(arr,i, j);//swap the values
                i++;
            }
        }
        swap(arr,i, high);
        return i; // the index of the pivot after the arrangement
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) 
        {
            int pivot_index = partation(arr, low, high);
            quickSort(arr, low, pivot_index - 1); //the array in the left of the pivot
            quickSort(arr, pivot_index + 1, high); // the array in the right of the pivot
        } }}
