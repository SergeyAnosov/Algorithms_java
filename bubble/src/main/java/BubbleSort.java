public class BubbleSort {

    public void sort(int[] a) {

        int in;
        int out;
        int out2;
        for (out = a.length - 1; out > 1; out--) { // Внешний цикл (обратный)
                for (in = 0; in < out; in++) { // Внутренний цикл (прямой)
                    if (a[in] > a[in + 1]) // Порядок нарушен?
                        swap(a, in, in + 1); // Поменять местами

                }
                for (out2 = a.length - 1; out2 > 1; out2--) {
                    if (a[out2] < a[out2 - 1]) {
                        swap(a, out2, out2 - 1);
                    }
                }
            }
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

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
