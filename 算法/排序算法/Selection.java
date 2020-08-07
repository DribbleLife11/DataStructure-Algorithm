/**
* 选择排序
*/
public class Selection {
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
}
