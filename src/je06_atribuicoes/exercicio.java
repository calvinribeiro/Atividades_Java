package je06_atribuicoes;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro Numero :");
        double num1 = scanner.nextDouble();

        System.out.println("digite o segundo numero :");
        double num2 = scanner.nextDouble();

        System.out.println("digite a operacao a ser feita :");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+' :
                resultado = num1 + num2;
                break;
            case '-' :
                resultado = num1 - num2;
                break;
            case 'x' :
                resultado = num1 * num2;
                break;
            case '/' :
                if (num2 !=0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("erro");
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida");
                return;
        }
        System.out.println("resultado é :" + resultado);
    }
}
