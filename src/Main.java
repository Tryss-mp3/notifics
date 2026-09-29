public class Main {
    public static void main(String[] args) {
        FabricNotif fabrica = new FabricNotif();

        Notificacao notificacaoEm = fabrica.criarNotificacao("email");
        notificacaoEm.enviar();

        Notificacao notificacaoSMS = fabrica.criarNotificacao("sms");
        notificacaoSMS.enviar();

        Notificacao notificacaoPush = fabrica.criarNotificacao("push");
        notificacaoPush.enviar();
    }
}