package semana3;
import java.util.Scanner;

public class Leitor {
    private static final Scanner SC = new Scanner(System.in);

    public static int nextInt() {
        return Integer.parseInt(SC.nextLine().trim());
    }

    public static String nextLine() {
        return SC.nextLine();
    }
}
