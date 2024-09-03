package je09_fluxos.condicional;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota");
        double nota = scanner.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7){
            System.out.println("recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println(nota);
    }
}
