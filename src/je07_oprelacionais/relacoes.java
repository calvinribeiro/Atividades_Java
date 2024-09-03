package je07_oprelacionais;
import java.util.Scanner;
public class relacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        int n1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int n2 = scanner.nextInt();


        if (n1 > n2)
            System.out.println("numero 1 maior que numero 2");

        if (n1 < n2)
            System.out.println("numero 1 menor que numero 2");

        if (n1 >= n2)
            System.out.println("numero maior ou igual");

        if (n1 != n2)
            System.out.println("numero diferente");
        else {
            System.out.println("deu errado ");
        }




    }
}
