import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {

    public static void main(String[] args) throws IOException {
        String input;

        while (true) {
            System.out.print(
                    "Enter strfing containing delimiters: ");
                    input = getString();
                    if (input.equals("")) {
                        break;
                    }
                    BracketChecker br = new BracketChecker(input);
                    br.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
