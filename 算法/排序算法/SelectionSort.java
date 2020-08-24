/**
* 选择排序
* 时间复杂度O（n^2）
*/
public class Selection {
    /*
    public static void selectionSort(Comparable[] a) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min].compareTo(a[j]) > 0) {
                    Comparable temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    */

    public void sort(int[] arr) {
        int minIndex,temp;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
