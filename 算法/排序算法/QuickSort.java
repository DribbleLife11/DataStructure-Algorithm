
/**
* 快速排序
*/
public class QuickSort {

    public static void quickSort(int[] a,int low,int high) {
        if (low >= high) return;

        int q =partition(a,low,high);
        quickSort(a,low,q-1);
        quickSort(a,q+1,high);
    }
    
    //切分
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        for (int j = low; j <= high-1; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}
