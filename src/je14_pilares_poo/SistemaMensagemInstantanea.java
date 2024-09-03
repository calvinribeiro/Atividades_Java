package je14_pilares_poo;

public class SistemaMensagemInstantanea {
    public void enviarMensagem(){
        if (verificarConectadoInternet())
            System.out.println("Enviando mensagem");
        else
            System.out.println("pc off");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private boolean verificarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
        return true;
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico de mensagem");
    }

}
