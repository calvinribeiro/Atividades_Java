package je07_oprelacionais;
import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        final int maior_idade = 18;

        boolean maiorIdade = idade >= maior_idade;

        String mensagem = nome + ( maiorIdade ? " é de maior,pode ir " : " pode voltar querida! ");

        System.out.println(mensagem);


    }
}
