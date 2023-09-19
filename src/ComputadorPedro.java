import aplicativos.FacebookMessenger;
import aplicativos.MSNMessenger;
import aplicativos.ServicoMensagemInstantanea;
import aplicativos.Telegram;

public class ComputadorPedro {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
/*
    # Processo usado para o método de Abstração

public class ComputadorPedro {
    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
*/

/*
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //
           # Método encapsulado na classe MSNMessenger

           msn.validarConectadoInternet();
           msn.salvarHistoricoMensagem();
        //

        msn.enviarMensagem();
        msn.receberMensagem();
    }
*/