/**
* 插入排序
* 时间复杂度O(n^2)
*/
public class InsertionSort {
    public void sort(int[] arr) {
//        int prevIndex, current;
//        for (int i = 1; i < arr.length; i++) {
//            prevIndex = i - 1;
//            current = arr[i];
//            while (prevIndex >= 0 && arr[prevIndex] > current) {
//                arr[prevIndex + 1] = arr[prevIndex];
//                prevIndex--;
//            }
//            arr[prevIndex + 1] = current;
//        }

        int len = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

