public class FabricNotif {
    public Notificacao criarNotificacao(String tipo) {
        if (tipo.equals("email")) {
            return new Email();
        } else if (tipo.equals("sms")) {
            return new SMS();
        } else if (tipo.equals("push")) {
            return new Push();
        }
        return null;
    }
}
