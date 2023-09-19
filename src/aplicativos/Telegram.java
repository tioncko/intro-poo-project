package aplicativos;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}

/*
    # Classe Telegram herdando os métodos que estão dentro da classe ServicoMensagemInstantanea
public class Telegram extends ServicoMensagemInstantanea {
}
*/