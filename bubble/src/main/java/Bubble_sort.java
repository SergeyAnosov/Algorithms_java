public class Bubble_sort {

    public int[] bubbleSort(int[] a) {

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
}
