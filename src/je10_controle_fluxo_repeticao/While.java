package je10_controle_fluxo_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("doce do valor:" + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
