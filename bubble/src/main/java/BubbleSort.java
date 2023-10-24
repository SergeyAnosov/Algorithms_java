public class BubbleSort {

    public int[] sort(int[] a) {

        for (int i = a.length - 1; i > 1; i --) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public int[] reverseSort(int[] a) {

        for (int i = a.length - 1; i > 1; i --) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
