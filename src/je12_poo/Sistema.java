package je12_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("gleyson sampaio", 35);
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(500.0);
        System.out.println(gleyson.limiteCredito);

        Cliente izabelly = new Cliente("izabelly cunha", 18);
        System.out.println(izabelly.limiteCredito);
        izabelly.solicitarLimiteCredito(50.0);
        System.out.println(izabelly.limiteCredito);

        System.out.println("limite da " + izabelly.nome + " é " + izabelly.limiteCredito);
        izabelly.comprar(25.5);
        System.out.println("izabelly gastou e agora tem " + izabelly.limiteCredito);

    }
}
