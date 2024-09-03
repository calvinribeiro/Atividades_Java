package je10_controle_fluxo_repeticao;

import java.util.Random;

public class For {
    public static void main(String[] args) {
        boolean acordado = true;
        int carneirinhos = 0;

            while(acordado){
                System.out.println("contando carneirinhos .." + (++carneirinhos));
                acordado = !(new Random().nextInt(10)== carneirinhos);
                if(carneirinhos ==20)
                    carneirinhos = 0;

            }
        System.out.println("dormiu");
    }
}