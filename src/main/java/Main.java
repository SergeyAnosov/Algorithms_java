import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Selection_sort ss = new Selection_sort();

        int[] ar1 = {5, 7, 3, 1, 0, 10, 0};
        int[] ar2 = {9, 7, 13, 1, -5, 10, 0, 17, 43};

        System.out.println(Arrays.toString(ss.selectionSort(ar1)));
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ss.selectionSort(ar2)));
    }
}
