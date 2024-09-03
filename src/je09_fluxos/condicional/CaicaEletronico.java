package je09_fluxos.condicional;

public class CaicaEletronico {
    public static void main(String[] args) {
        double saldo = 160.0;
        double valorSolicitado = 17.0;

        if ( valorSolicitado <= saldo ) {
            saldo = saldo - valorSolicitado;
            System.out.println("saldo realizado com sucesso");
        } else {
            System.out.println("saldo insuficiente");
        }


        System.out.println(saldo);
    }
}
