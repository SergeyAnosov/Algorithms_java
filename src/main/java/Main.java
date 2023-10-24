import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int arraySize = 200000;

        int[] arr = new int[arraySize];

        for(int j = 0; j < arraySize; j++) // Заполнение массива
        { // случайными числами
            int n = (int) (Math.random() * (arraySize - 1));
            arr[j] = n;
        }
        //System.out.println(Arrays.toString(arr));

        InsertionSort s = new InsertionSort(); //bubble - 50s, selection - 18s, insertion - 2s.
        s.reverseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
