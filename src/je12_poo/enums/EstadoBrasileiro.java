package je12_poo.enums;

public enum EstadoBrasileiro {
    PI("piaui"),
    MA("maranhao"),
    SP("sao paulo"),
    RJ("rio de janeiro"),
    CE("ceara")

    ;

    private String nome;
    private EstadoBrasileiro(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
