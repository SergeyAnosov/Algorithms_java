public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findX(array, 5));
    }

    private static int findX(int[] array, int i) {
        return recFind(array, i, 0, array.length - 1);
    }

    public static int find(int[] a, int searchKey) {
        int low = 0;
        int high = a.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < searchKey) {
                low = mid + 1;
            } else if (a[mid] > searchKey) {
                high = mid - 1;
            } else if (a[mid] == searchKey) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int recFind(int[] a, int searchKey, int low, int high) {
        int index = -1;
        int mid = low + (high - low) / 2;
        if (a[mid] == searchKey) {
            index = mid;
            return index;
        } else if (a[mid] < searchKey) {
            return recFind(a, searchKey, mid + 1, high);
        } else if (a[mid] > searchKey) {
            return recFind(a, searchKey, low, mid - 1);
        }
        return index;
    }
}
