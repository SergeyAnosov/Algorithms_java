public class TriangleNumber {
    public static void main(String[] args) {
        System.out.println(triangle(6));
        System.out.println(recursionTriangle(6));

    }

   public static int triangle(int n) {
        int total = 0;
        while(n > 0) {
            total = total + n; // Переменная total увеличивается на n (высоту столбца)
            --n; // Уменьшение высоты столбца
        }
        return total;
    }

    public static int recursionTriangle(int n) {
        int total = 0;
        if (n < 0) {
            return total;
        }
        return n + recursionTriangle(n - 1);
    }
}
