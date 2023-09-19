package aplicativos;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
/*
    # Classe FacebookMessenger herdando os métodos que estão dentro da classe ServicoMensagemInstantanea
public class FacebookMessenger extends ServicoMensagemInstantanea {
}
*/
