package je09_fluxos.condicional;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual seu tamanho?");
        String sigla = scanner.nextLine();

        switch (sigla) {
            case "P" : {
                System.out.println("pequeno");
                break;
            }
            case "M" : {
                System.out.println("medio");
                break;
                }
            case "G" : {
                System.out.println("grande");
                break;
            }
        }
        System.out.println(sigla);
    }
}
