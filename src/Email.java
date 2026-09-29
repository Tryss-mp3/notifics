public class Email implements Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por email!!!");
    }
}
