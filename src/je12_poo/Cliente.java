package je12_poo;

public class Cliente {
    String nome;
    int idade;
    double limiteCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
    public Cliente (String nomeInformado, int idadeInformada){
        nome = nomeInformado;
        idadeInformada = idade;


    }
}
