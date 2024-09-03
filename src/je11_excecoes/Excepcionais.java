package je11_excecoes;

public class Excepcionais {
    public static void main(String[] args) {

        try {
            double valor = Double.valueOf("a1.75");
            System.out.println(valor);

        } catch(NumberFormatException ex){
            System.err.println("deu errado");
        }
    }
}
