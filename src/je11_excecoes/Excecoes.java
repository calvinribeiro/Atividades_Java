package je11_excecoes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("digite sua altura: ");
            String alturaStr = scanner.nextLine();
            double altura = Double.parseDouble(alturaStr.replace(",", "."));



            System.out.println("ola me chamo " + nome + sobrenome + " tenho " + idade + " minha altura é " + altura);
        }catch (InputMismatchException e){
            System.out.println("entrada invalida");
        }


        scanner.close();
    }
}
