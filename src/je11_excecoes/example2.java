package je11_excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("digita ai :");
            int numero = scanner.nextInt();
            System.out.println("voce digitou " + numero);

        } catch (InputMismatchException e) {
            System.out.println("escrita invalida");
        }
    }
}
