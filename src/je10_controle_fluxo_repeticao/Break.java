package je10_controle_fluxo_repeticao;

public class Break {
    public static void main(String[] args) {

        for(int numero = 1; numero <=5; numero ++){
            if (numero==3)
                break;

            System.out.println(numero);
        }
    }
}
