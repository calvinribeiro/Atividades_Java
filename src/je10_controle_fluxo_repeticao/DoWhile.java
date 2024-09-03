package je10_controle_fluxo_repeticao;
import java.util.Random;
public class DoWhile {
    private static int numeroTentativas = 0;
    public static void main(String[] args) {
        System.out.println("discando...");

        do{
            System.out.println("telefone tocando");
        } while(tocando());
        if (numeroTentativas < 5) {
            System.out.println("alou?");
        } else {
            System.out.println("nao atendeur");
        }


    }
    private static boolean tocando(){
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;
        if(numeroTentativas == 5){
            return false;
        }else
        return !atendeu;
    }
}
