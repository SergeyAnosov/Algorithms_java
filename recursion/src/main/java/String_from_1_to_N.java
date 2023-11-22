public class String_from_1_to_N {

    public static void main(String[] args) {
        System.out.println(new StringBuilder(recursionFunc(8)).reverse());
    }

    public static String recursionFunc(int n) {
        String r = String.valueOf(n);

        if (n == 1) {
            return r;
        }

        return n + " " + recursionFunc(n - 1);
    }
}
