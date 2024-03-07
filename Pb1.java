import java.util.Scanner;

public class Pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un numar: ");
        double numar = scanner.nextDouble();

        if (numar > 5) {
            System.out.println("ADMIS");
        } else if (numar < 1 || numar > 10) {
            System.out.println("INVALID");
        } else {
            System.out.println("RESPINS");
        }
    }
}