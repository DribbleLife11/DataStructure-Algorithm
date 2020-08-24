/**
* 归并排序
*/
public class Merge {
    public void mergeSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        else {
            //用end - start而不是start + end 是防止当end过大时造成整型溢出
            int mid = start + (end - start) /2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid + 1,end);
            merge(arr,start,mid,end);
            //merge();
        }
    }

    //归并
    public void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[arr.length];
        int i = start;
        int j = mid + 1;


        if (end + 1 - start >= 0)
            System.arraycopy(arr, start, temp, start, end + 1 - start);

        for (int k = start; k <= end; k++) {
            if (i > mid)
                arr[k] = temp[j++];
            else if (j > end)
                arr[k] = temp[i++];
            else if (temp[i] < temp[j])
                arr[k] = temp[i++];
            else
                arr[k] = temp[j++];
        }

    }
    
    
    /*
    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) >> 1; // (left + right) / 2

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 中间数组
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
        // 也可以用 System.arraycopy(a, start1, b, start2, length)
    }
    */
}
